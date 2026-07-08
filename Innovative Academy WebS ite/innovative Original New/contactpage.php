<?php 
 if(isset($_POST["sendmail"]))
 {
         
        $fname=$_REQUEST['fname'];
        $lname=$_REQUEST['lname'];
        $email=$_REQUEST['email']; //echo "</br>";
        $phone=$_REQUEST['phone'];  //echo "</br>";
        $comment=$_REQUEST['comment'];  //echo "</br>";
    
        $to      = 'suwarna@innovativeacademy.in,mayur@innovativeacademy.in';
        
        $subject = $email;
        
        $message =  "First Name: {$fname}" . "\r\n\n" ."last Name: {$lname}" . "\r\n\n" . "Email: {$email}" . "\r\n\n" . "Phone: {$phone}" . "\r\n\n" . "Comment:{$comment}";
        
        $headers = 'Name: "$name"' . "\r\n" . 'Email: "$email"' . "\r\n" . 'X-Mailer: PHP/' . phpversion();
        
        
        
        mail($to, $subject,$message, $headers);

}
?>

 

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" href="images/download.png" type="image/gif" sizes="16x16">
    <title>Contact us | Software Product Development Company in Bangalore, India</title>
    <link href="assets/plugins/pace/pace-theme-flash.css" rel="stylesheet" type="text/css" />
    <link href="assets/plugins/pace/bootstrap.min.css" rel="stylesheet" type="text/css" />
    <link href="assets/plugins/pace/font-awesome.css" rel="stylesheet" type="text/css" />
    <link href="assets/plugins/pace/swiper.css" rel="stylesheet" type="text/css" media="screen" />
    <!-- END PLUGINS -->
    <!-- BEGIN PAGES CSS -->
    <link class="main-stylesheet" href="assets/plugins/pace/pages.css" rel="stylesheet" type="text/css" />
    <link class="main-stylesheet" href="assets/plugins/pace/pages-icons.css" rel="stylesheet" type="text/css" />
    <link class="main-stylesheet" href="assets/plugins/pace/audiolife.css" rel="stylesheet" type="text/css">
    <style>
        
       .main{
        margin-top: 15%;
         
       }
        h4{
            text-align:center;
            margin-top:2%;
        }
        .button-success{
            text-align:center;
             margin-top:2%;
        }
         h1 {text-align: center;}
        
        
    </style>
</head>
<body>

     <div class="row-fluid main">
      <h1> Thank You. </h1> <br>
        <center><img src="http://www.innovativeacademy.in/img/logo.png"></center>
        <div>
            <h4>Dear <?php echo $_REQUEST['name']; ?>, Thanks for showing interest in innovativeacademy.. We will get back to you at the earliest.</h4>
              <img height="1" width="1" style="border-style:none;" alt="" src="//www.googleadservices.com/pagead/conversion/872009333/?label=S0xLCOX-sXIQ9ZznnwM&amp;guid=ON&amp;script=0"/>
            <div class="button-success"><a href="http://innovativeacademy.in/" role="button" class="btn port">
                <span class="glyphicon glyphicon-home"></span><b>HOME</b></a></div>
        </div>
    </div>
</body>
</html>