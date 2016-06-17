/*
 * Copyright (c) 2016 by Johannes Dillmann,
 *               Zuse Institute Berlin
 *
 * Licensed under the BSD License, see LICENSE file for details.
 *
 */

package org.xtreemfs.osd.ec;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.xtreemfs.common.uuids.ServiceUUID;
import org.xtreemfs.common.xloc.Replica;
import org.xtreemfs.common.xloc.XLocations;
import org.xtreemfs.foundation.buffer.ASCIIString;
import org.xtreemfs.foundation.flease.Flease;
import org.xtreemfs.foundation.flease.comm.FleaseMessage;
import org.xtreemfs.foundation.logging.Logging;
import org.xtreemfs.foundation.logging.Logging.Category;
import org.xtreemfs.osd.stages.Stage.StageRequest;
import org.xtreemfs.pbrpc.generatedinterfaces.GlobalTypes.FileCredentials;

public class ECFileState {
    public enum FileState {
        INITIALIZING, 
        // OPENING,
        // RECOVERING,
        WAITING_FOR_LEASE,
        VERSION_RESET,
        
        INVALIDATED, 
        BACKUP, 
        PRIMARY
    }

    final String             fileId;
    final ASCIIString        cellId;
    final XLocations         locations;
    FileCredentials          credentials;
    final List<ServiceUUID>  remoteOSDs;
    final List<StageRequest> pendingRequests;

    FileState                state;
    long                     masterEpoch;
    boolean                  localIsPrimary;
    Flease                   lease;
    boolean                  cellOpen;

    ECFileState(String fileId, ASCIIString cellId, ServiceUUID localUUID, XLocations locations,
            FileCredentials credentials) {
        this.fileId = fileId;
        this.cellId = cellId;
        this.locations = locations;
        this.credentials = credentials;

        remoteOSDs = new ArrayList<ServiceUUID>(locations.getNumReplicas() - 1);
        for (Replica r : locations.getReplicas()) {
            final ServiceUUID headOSD = r.getHeadOsd();
            if (!headOSD.equals(localUUID)) {
                remoteOSDs.add(headOSD);
            }
        }

        pendingRequests = new LinkedList<StageRequest>();
        resetDefaults();
    }

    void resetDefaults() {
        state = FileState.INITIALIZING;
        masterEpoch = FleaseMessage.IGNORE_MASTER_EPOCH;
        localIsPrimary = false;
        lease = Flease.EMPTY_LEASE;
        cellOpen = false;
    }

    String getFileId() {
        return fileId;
    }

    ASCIIString getCellId() {
        return cellId;
    }

    XLocations getLocations() {
        return locations;
    }

    List<ServiceUUID> getRemoteOSDs() {
        return remoteOSDs;
    }

    void setState(FileState state) {
        if (Logging.isDebug()) {
            Logging.logMessage(Logging.LEVEL_DEBUG, Category.ec, this, "fileId %s changed state from: %s to: %s",
                    this.fileId, this.state, state);
        }
        this.state = state;
    }

    FileState getState() {
        return state;
    }

    void setMasterEpoch(long masterEpoch) {
        this.masterEpoch = masterEpoch;
    }

    long getMasterEpoch() {
        return masterEpoch;
    }

    /**
     * Appends the request to the end of the list of pending requests.
     * 
     * @param request
     */
    void addPendingRequest(StageRequest request) {
        pendingRequests.add(request);
    }

    /**
     * Retrieves and removes the head (first element) of the list of pending requests.
     * 
     * @return request or null if none exists
     */
    StageRequest removePendingRequest() {
        StageRequest req = null;
        if (hasPendingRequests()) {
            req = pendingRequests.remove(0);
        }

        return req;
    }

    /**
     * Returns true if there are pending requests.
     */
    boolean hasPendingRequests() {
        return (!pendingRequests.isEmpty());
    }

    /**
     * Returns the number of pending requests.
     */
    int sizeOfPendingRequests() {
        return pendingRequests.size();
    }

    void setCredentials(FileCredentials credentials) {
        this.credentials = credentials;
    }

    FileCredentials getCredentials() {
        return credentials;
    }

    boolean isLocalIsPrimary() {
        return localIsPrimary;
    }

    void setLocalIsPrimary(boolean localIsPrimary) {
        this.localIsPrimary = localIsPrimary;
    }

    Flease getLease() {
        return lease;
    }

    void setLease(Flease lease) {
        this.lease = lease;
    }

    boolean isCellOpen() {
        return cellOpen;
    }

    void setCellOpen(boolean cellOpen) {
        this.cellOpen = cellOpen;
    }

}