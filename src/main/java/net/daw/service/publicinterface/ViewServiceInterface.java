
package net.daw.service.publicinterface;

import net.daw.bean.ReplyBean;


public interface ViewServiceInterface {

    public ReplyBean getPage() throws Exception;

    public ReplyBean getCount() throws Exception;

    public ReplyBean getPageX() throws Exception;

    public ReplyBean getCountX() throws Exception;

}
