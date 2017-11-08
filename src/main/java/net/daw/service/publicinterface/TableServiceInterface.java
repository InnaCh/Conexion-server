
package net.daw.service.publicinterface;

import net.daw.bean.ReplyBean;


public interface TableServiceInterface {

    public ReplyBean get() throws Exception;

    public ReplyBean set() throws Exception;

    public ReplyBean remove() throws Exception;

}
