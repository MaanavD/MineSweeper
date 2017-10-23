/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication42;

/**
 *
 * @author Maanav
 */
public class JavaApplication42 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("hello");
    }
    
}
public static ClientResponse SendSimpleMessage() {
    Client client = Client.create();
    client.addFilter(new HTTPBasicAuthFilter(
        "api","key-3ax6xnjp29jd6fds4gc373sgvjxteol0"));
    WebResource webResource = client.resource(
        "https://api.mailgun.net/v3/samples.mailgun.org/messages");
    MultivaluedMapImpl formData = new MultivaluedMapImpl();
    formData.add("from", "Excited User <excited@samples.mailgun.org>");
    formData.add("to", "devs@mailgun.net");
    formData.add("subject", "Hello");
    formData.add("text", "Testing some Mailgun awesomeness!");
    return webResource.type(MediaType.APPLICATION_FORM_URLENCODED).
        post(ClientResponse.class, formData);
}