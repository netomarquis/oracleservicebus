package osb.book.soap.jms;

/**
 * Generated interface, do not edit.
 *
 * This stub interface was generated by weblogic
 * webservice stub gen on Sun Dec 25 21:42:26 CET 2011  
 */

public interface HelloWorldService extends java.rmi.Remote {
     
  /**
   * Operation Name : {http://wsrm.osbbook}sayHello   */

  public java.lang.String sayHello() throws java.rmi.RemoteException;
    public void sayHelloAsync(weblogic.wsee.async.AsyncPreCallContext apc ) throws java.rmi.RemoteException ;
  
}