#!/bin/sh

LD_PRELOAD="$1"
XTREEMFS_PRELOAD_OPTIONS="$2"
EXECUTABLE="$3"
shift 3

XTREEMFS_PRELOAD_OPTIONS="$XTREEMFS_PRELOAD_OPTIONS" LD_PRELOAD="$LD_PRELOAD" $EXECUTABLE "$@"