package org.xtreemfs.interfaces.OSDInterface;

import java.io.StringWriter;
import org.xtreemfs.*;
import org.xtreemfs.common.buffer.ReusableBuffer;
import org.xtreemfs.interfaces.*;
import org.xtreemfs.interfaces.utils.*;
import yidl.Marshaller;
import yidl.PrettyPrinter;
import yidl.Struct;
import yidl.Unmarshaller;




public class xtreemfs_internal_truncateRequest extends org.xtreemfs.interfaces.utils.Request
{
    public static final int TAG = 2009082959;
    
    public xtreemfs_internal_truncateRequest() { file_credentials = new FileCredentials();  }
    public xtreemfs_internal_truncateRequest( FileCredentials file_credentials, String file_id, long new_file_size ) { this.file_credentials = file_credentials; this.file_id = file_id; this.new_file_size = new_file_size; }

    public FileCredentials getFile_credentials() { return file_credentials; }
    public void setFile_credentials( FileCredentials file_credentials ) { this.file_credentials = file_credentials; }
    public String getFile_id() { return file_id; }
    public void setFile_id( String file_id ) { this.file_id = file_id; }
    public long getNew_file_size() { return new_file_size; }
    public void setNew_file_size( long new_file_size ) { this.new_file_size = new_file_size; }

    // java.lang.Object
    public String toString() 
    { 
        StringWriter string_writer = new StringWriter();
        PrettyPrinter pretty_printer = new PrettyPrinter( string_writer );
        pretty_printer.writeStruct( "", this );
        return string_writer.toString();
    }

    // Request
    public Response createDefaultResponse() { return new xtreemfs_internal_truncateResponse(); }


    // java.io.Serializable
    public static final long serialVersionUID = 2009082959;    

    // yidl.Object
    public int getTag() { return 2009082959; }
    public String getTypeName() { return "org::xtreemfs::interfaces::OSDInterface::xtreemfs_internal_truncateRequest"; }
    
    public int getXDRSize()
    {
        int my_size = 0;
        my_size += file_credentials.getXDRSize(); // file_credentials
        my_size += Integer.SIZE / 8 + ( file_id != null ? ( ( file_id.getBytes().length % 4 == 0 ) ? file_id.getBytes().length : ( file_id.getBytes().length + 4 - file_id.getBytes().length % 4 ) ) : 0 ); // file_id
        my_size += Long.SIZE / 8; // new_file_size
        return my_size;
    }    
    
    public void marshal( Marshaller marshaller )
    {
        marshaller.writeStruct( "file_credentials", file_credentials );
        marshaller.writeString( "file_id", file_id );
        marshaller.writeUint64( "new_file_size", new_file_size );
    }
    
    public void unmarshal( Unmarshaller unmarshaller ) 
    {
        file_credentials = new FileCredentials(); unmarshaller.readStruct( "file_credentials", file_credentials );
        file_id = unmarshaller.readString( "file_id" );
        new_file_size = unmarshaller.readUint64( "new_file_size" );    
    }
        
    

    private FileCredentials file_credentials;
    private String file_id;
    private long new_file_size;    

}

