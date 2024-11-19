<%-- 
    Document   : Signup
    Created on : 07-Apr-2023, 12:42:00 pm
    Author     : RITIK SHARMA
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        
        <!--  for adding material css library here i am going to write link --> 
        <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>
    
    <!<!-- adding external css file -->
    <link rel="stylesheet" href="Registation.css" />
    
    
            
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container">
            
            <div class="row">
                <div class="col m6 offset-m3">
                <div class="card">
                    
                    <div class="card-content">
                        <h3 style="margin-top: 10px;" class="center-align">Register here !!</h3>
                       
                        <h5 id="msg" class="center-align"></h5>
                        
                        <div class="form center-align">
                            <!--<!-- creating form here -->
                            
                            <form action="servlet" method="post" id="myform">
                                <input type="text" placeholder="enter user name" name="user_name">
                                <input type="password" placeholder="enter password" name="user_pass">
                                 <input type="email" placeholder="enter email" name="user_email">
                                <button type="submit" class="btn btn-primary" >submit</button>
                                
                            </form>
                        </div>
 <div class="loader center-align "  style="margin-top: 10px; display: none">                  
    <div class="preloader-wrapper big active">
      <div class="spinner-layer spinner-blue">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-red">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-yellow">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
      </div>

      <div class="spinner-layer spinner-green">
        <div class="circle-clipper left">
          <div class="circle"></div>
        </div><div class="gap-patch">
          <div class="circle"></div>
        </div><div class="circle-clipper right">
          <div class="circle"></div>
        </div>
         </div>
     </div>
      <h4>  pleace.. wait</h4>             
  </div>
          
                        
  
                    </div>
                </div>
            </div>
            
            </div>
            
        </div>
        
        
        
        <script
  src="https://code.jquery.com/jquery-3.6.4.min.js"
  integrity="sha256-oP6HI9z1XaZNBrJURtCoUT5SUnxFr8s3BzRl+cbzUq8="
  crossorigin="anonymous"></script>
  <script>
      
     $(document).ready(function(){
         
         console.log("page is ready...")
         
         $("#myform").on('submit',function(event)
         {
             // page ko dushre page par jane se rokne ke liye we are using  prevent...
             event.preventDefault();
             var f=$(this).serialize();
             // this means form 
             console.log(f);
             
             // doing loader true
             $(".loader").show();
             // dong form hind
             $(".form").hide();
             $.ajax({
                 url:"servlet",
                 data:f,
                 type:'POST',
                 success:function(data,textStatus,jqXHR){
                     console.log(data);
                     console.log("sucess..........")
                     
                      // doing loader true
                      $(".loader").hide();
                      // dong form hind
                      $(".form").show();
                      
                      if(data.trim()==='done')
                      {
                          $('#msg').html("successfully Registed!!")
                          $('#msg').addClass('green-text')
                      }
                      else{
                          $('#msg').html("somthing want wrong!!")
                          $('#msg').addClass('red-text')
                      }
                 },
                 error:function(jqXHR,textStatus,errorThrown){
                     console.log(data);
                     console.log("error.......")
                     
                     // doing loader true
                      $(".loader").hide();
                      // dong form hind
                      $(".form").show();
                      $('#msg').html("somthing want wrong!!")
                      $('#msg').addClass('red-text')
                 }
             })
         })
             
         
         
     })
  </script>
    </body>
</html>
