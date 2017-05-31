/**
 * Miguel Created: 2015/08/24
 */
package com.example.common.web;

//import com.cicha.commons.RequestContext;
//import security.cont.SessionData;
//import security.cont.SessionManager;
//import com.example.service.ExampleService;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.Priority;
import javax.ejb.EJB;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.PreMatching;
import javax.ws.rs.ext.Provider;
//import security.cont.UserCont;
//import security.entities.User;

@Provider
@PreMatching
//@Priority(PrioritiesFilters.REQUEST_CONTEXT)
public class RequestContextFilter implements ContainerRequestFilter {
//
//    @EJB
//    UserCont uCont;
//    @EJB
//    SessionManager sm;
    
//    @EJB
//   ExampleService exampleService;

    @Override
    public void filter(ContainerRequestContext requestContext) throws IOException {
        System.out.println("RequestContextFilter");
//        exampleService.whoAmI();
//        //en cada request que se realiza al server, se inicializa el RequestContext
//        //que almacen la informacion en todo el work flow hasta el response  
//        if (requestContext.getMethod().equals("OPTIONS")) {
//            return;
//        }
//        RequestContext.initialize();
//         RequestContext.setContainerRequestContext(requestContext);
//        //leyendo usuario
//        String tokenAuth = requestContext.getHeaderString("Authorization");
//        try {
//            SessionData sd = sm.get(tokenAuth);
//            if (sd != null) {
//                RequestContext.setAttribute("sd", sd);
//                Long userId = sd.getUserId();
//                if (userId != null) {
//                    RequestContext.setUserId(userId);
//                    User user = uCont.find(userId);
//                    if (user != null) {
//                        RequestContext.setUser(user);
//                    }
//                }
//            }
//        } catch (Exception ex) {
//            Logger.getLogger(RequestContextFilter.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

}
