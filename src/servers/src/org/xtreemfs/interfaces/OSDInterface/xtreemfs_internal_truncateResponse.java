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




public class xtreemfs_internal_truncateResponse extends org.xtreemfs.interfaces.utils.Response
{
    public static final int TAG = 2009082959;
    
    public xtreemfs_internal_truncateResponse() { osd_write_response = new OSDWriteResponse();  }
    public xtreemfs_internal_truncateResponse( OSDWriteResponse osd_write_response ) { this.osd_write_response = osd_write_response; }

    public OSDWriteResponse getOsd_write_response() { return osd_write_response; }
    public void setOsd_write_response( OSDWriteResponse osd_write_response ) { this.osd_write_response = osd_write_response; }

    // java.lang.Object
    public String toString() 
    { 
        StringWriter string_writer = new StringWriter();
        PrettyPrinter pretty_printer = new PrettyPrinter( string_writer );
        pretty_printer.writeStruct( "", this );
        return string_writer.toString();
    }


    // java.io.Serializable
    public static final long serialVersionUID = 2009082959;    

    // yidl.Object
    public int getTag() { return 2009082959; }
    public String getTypeName() { return "org::xtreemfs::interfaces::OSDInterface::xtreemfs_internal_truncateResponse"; }
    
    public int getXDRSize()
    {
        int my_size = 0;
        my_size += osd_write_response.getXDRSize(); // osd_write_response
        return my_size;
    }    
    
    public void marshal( Marshaller marshaller )
    {
        marshaller.writeStruct( "osd_write_response", osd_write_response );
    }
    
    public void unmarshal( Unmarshaller unmarshaller ) 
    {
        osd_write_response = new OSDWriteResponse(); unmarshaller.readStruct( "osd_write_response", osd_write_response );    
    }
        
    

    private OSDWriteResponse osd_write_response;    

}

