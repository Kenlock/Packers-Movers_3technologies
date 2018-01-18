/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import statelesspack.RegisterusersFacade;
import statelesspack.RegisterusersFacadeLocal;

/**
 *
 * @author dell
 */
public class reglog extends HttpServlet {
    @EJB
    private RegisterusersFacadeLocal registerusersFacade1;
    @EJB
    private RegisterusersFacadeLocal registerusersFacade;
    
    
   
    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            String nam=request.getParameter("name").toString();
            String mob=request.getParameter("mobno").toString();
            String emailid=request.getParameter("email").toString();
            String usrnam=request.getParameter("uname").toString();
            String pas=request.getParameter("pass").toString();
            String cpas=request.getParameter("cpass").toString();
            out.println(nam);
            out.println(mob);
            out.println(emailid);
            out.println(usrnam);
            out.println(pas);
            out.println(cpas);
            
        //    if (pas.equals(cpas))
        //    {
          // boolean b = registerusersFacade.insertion(nam, mob, emailid, cpas, pas);
           String d=registerusersFacade1.insertion(nam, mob, emailid, usrnam, pas);
           out.println(d);
                if(d.equals("true"))
                {
                    out.println("Success");
                }
                else
                {
                    out.println("fails");
                }
          //      else
        //    {
       //         out.println("Passwords mismatch!");
       //     }
                    
     /*if(pas.equals(cpas))
         {
          //out.println("ok"); 
           i
           {
                //out.println("<html>");
       // out.println("<script>");
       //  out.println("alert"+"(" + " "  +"\" Your Account has been Registered Successfully \""+")"+";");
              
     //  out.println("window"+"."+"location"+'='+"\"http://localhost:50498/Banknew-war/home.jsp\"");
     //  out.println("</script>"); 
     //  out.println("<body bgcolor"+"="+"pink"+">");
            out.println("Success");
           //   out.println("</body>");
            //  out.println("</html>"); 
           }
           else
           {
               // out.println("<html>");
        //out.println("<script>");
        // out.println("alert"+"(" + " "  +"\" Invalid Data..Please provide Valid Data \""+")"+";");
       //  http://localhost:50498/EJBBank-war/
       
     //  out.println("window"+"."+"location"+'='+"\"http://localhost:50498/Banknew-war/accountcreation.jsp\"");
      // out.println("</script>"); 
   //    out.println("<body bgcolor"+"="+"pink"+">");
       out.println("failed");
            // request.getRequestDispatcher("/user.jsp").forward(request, response);
          //    out.println("</body>");
         //     out.println("</html>"); 
           }
       }
           //else {
        //          out.println("<html>");
       //   out.println("<script>");
      //   out.println("alert"+"(" + " "  +"\"Passwords do not match!\""+")"+";");
           // }*/
        }
        catch(Exception e)
        {
            out.println("Exception:"+e.toString());
        }
        finally {            
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP
     * <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
