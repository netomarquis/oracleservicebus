package wsrm.client;

import java.security.cert.X509Certificate;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import javax.xml.ws.BindingProvider;
import javax.xml.ws.WebServiceRef;

import weblogic.security.SSL.TrustManager;

import weblogic.wsee.security.bst.ClientBSTCredentialProvider;
import weblogic.wsee.security.saml.SAMLTrustCredentialProvider;
import weblogic.wsee.security.unt.ClientUNTCredentialProvider;
import weblogic.wsee.security.util.CertUtils;

import weblogic.xml.crypto.wss.WSSecurityContext;
import weblogic.xml.crypto.wss.provider.CredentialProvider;
// !THE CHANGES MADE TO THIS FILE WILL BE DESTROYED IF REGENERATED!
// This source file is generated by Oracle tools
// Contents may be subject to change
// For reporting problems, use the following
// Version = Oracle WebServices (11.1.1.0.0, build 101221.1153.15811)

public class HelloWorldServiceSoapHttpPortBindingQSPortClient
{
  @WebServiceRef
  private static HelloWorldServiceSoapHttpPortBindingQSService helloWorldServiceSoapHttpPortBindingQSService;

  public static void main(String[] args) {
    try {
      helloWorldServiceSoapHttpPortBindingQSService = new HelloWorldServiceSoapHttpPortBindingQSService();
      HelloWorldService helloWorldService = helloWorldServiceSoapHttpPortBindingQSService.getHelloWorldServiceSoapHttpPortBindingQSPort();

      Map<String, Object> requestContext = ((BindingProvider) helloWorldService).getRequestContext();

      helloWorldService.sayHelloOneWay();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

}
