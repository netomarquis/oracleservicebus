package osb.book.soap.jms;

/**
 * Generated class, do not edit.
 *
 * This stub class was generated by weblogic
 * webservice stub gen on Sun Dec 25 21:42:26 CET 2011 
 */

public class HelloWorldService_Stub 
     extends weblogic.wsee.jaxrpc.StubImpl
     implements osb.book.soap.jms.HelloWorldService, /**/java.io.Serializable
{

  public HelloWorldService_Stub(weblogic.wsee.wsdl.WsdlPort port, 
                        weblogic.wsee.jaxrpc.ServiceImpl service) 
    throws javax.xml.rpc.ServiceException
  {
    super(port, osb.book.soap.jms.HelloWorldService.class, service);
  }
  
    
  /**
   * Operation Name : {http://wsrm.osbbook}sayHello   */

  public java.lang.String sayHello() throws java.rmi.RemoteException {

    java.util.ArrayList _args = new java.util.ArrayList();

    try {
            java.lang.Object _result = _invoke("sayHello", _args.toArray());
      return (java.lang.String)_result;
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {

      
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
  }  public void sayHelloAsync(weblogic.wsee.async.AsyncPreCallContext apc ) throws java.rmi.RemoteException  {
    java.util.ArrayList _args = new java.util.ArrayList();

    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY, "true");
    _setProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY, apc);
    _setProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY, "sayHello");
    _setProperty(weblogic.wsee.async.AsyncConstants.OPERATION_NAME_PROPERTY,
                 "sayHello");
    _setProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY, "java.lang.String");

    try {
      java.lang.Object _result = _invoke("sayHello", _args.toArray());
    } catch (javax.xml.rpc.JAXRPCException _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception.getLinkedCause());
    } catch (javax.xml.rpc.soap.SOAPFaultException _wls_exception) {
      throw new java.rmi.RemoteException(_soapFault2String(_wls_exception), _wls_exception);
    } catch (java.lang.Throwable _wls_exception) {
      throw new java.rmi.RemoteException(_wls_exception.getMessage(), _wls_exception);
    }
    finally {
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_INVOKE_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.ASYNC_PRE_CALL_CONTEXT_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.METHOD_NAME_PROPERTY);
      _removeProperty(weblogic.wsee.async.AsyncConstants.RETURN_TYPE_PROPERTY);

    }
  }
   
    
  private Object writeReplace() throws java.io.ObjectStreamException {
    java.util.HashMap map = new java.util.HashMap();
            map.put("HelloWorldServiceSoapHttpPortBindingQSPort", "HelloWorldServiceSoapHttpPortBindingQSPort");
            
    return new weblogic.wsee.tools.clientgen.stubgen.StubSerialWrapper(
      "osb.book.soap.jms.HelloWorldServiceSoapHttpPortBindingQSService",
      (String)map.get(_getPortName()),
      _getUserProperties());
  }
}