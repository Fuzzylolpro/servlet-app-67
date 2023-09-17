<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Form application</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/css/bootstrap.min.css" rel="stylesheet"
          integrity="sha384-4bw+/aepP/YC94hEpVNVgiZdgIC5+VKNBQNGCHeKRQN+PtmoHDEXuppvnDJzQIu9" crossorigin="anonymous">
</head>
<body>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css" />
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">

<style>
    .form-container{
        background-color: #fff;
        font-family: 'Poppins', sans-serif;
        text-align: center;
        padding: 30px 25px;
        border-radius: 10px;
        box-shadow: 0 0 25px -15px rgba(0,0,0,0.3);
        position: relative;
    }
    .form-container:before,
    .form-container:after{
        content: '';
        background-color: #4E4C97;
        height: 50%;
        width: 4px;
        position: absolute;
        left: 10px;
        top: 10px;
    }
    .form-container:after{
        top: auto;
        bottom: 10px;
        left: auto;
        right: 10px;
    }
    .form-container .title{
        color: #4E4C97;
        font-size: 25px;
        font-weight: 700;
        text-transform: capitalize;
        margin: 0 0 15px;
    }
    .form-container .social-links{
        padding: 0;
        margin: 0 0 15px;
        list-style: none;
    }
    .form-container .social-links li{
        display: inline-block;
        margin: 0 3px;
    }
    .form-container .social-links li a{
        color: #555;
        line-height: 27px;
        height: 28px;
        width: 28px;
        border: 1px solid #555;
        border-radius: 50%;
        display: block;
        transition: all 0.3s ease 0s;
    }
    .form-container .social-links li a:hover{
        color: #fff;
        background-color: #4E4C97;
    }
    .form-container .description{
        color: #555;
        font-size: 13px;
        margin: 0 0 10px;
        display: block;
    }
    .form-horizontal .form-group{ margin: 0 0 15px; }
    .form-horizontal .form-group:last-of-type{
        text-align: left;
        margin-bottom: 35px;
    }
    .form-horizontal .form-control{
        color: #4E4C97;
        background: #F7F8F9;
        font-size: 14px;
        font-weight: 500;
        letter-spacing: 1px;
        height: 40px;
        padding: 6px 12px;
        border-radius: 5px;
        border: 2px solid #F2F5F6;
        box-shadow: none;
    }
    .form-horizontal .form-control:focus{
        border-color: rgba(78, 76, 151, 0.5);
        box-shadow: none;
    }
    .form-horizontal .form-control::placeholder{
        color: #e1e1e1;
        font-size: 14px;
        font-weight: 300;
    }
    .form-horizontal .form-group .check-label{
        color: #555;
        font-size: 12px;
        font-weight: 400;
        text-transform: none;
        margin: -2.5px 0 0;
        vertical-align: text-top;
        display: inline-block;
    }
    .form-horizontal .form-group .check-label a{
        color: #4E4C97;
        transition: all 0.3s ease;
    }
    .form-horizontal .form-group .check-label a:hover{ text-decoration: underline; }
    .form-horizontal .checkbox{
        height: 17px;
        width: 17px;
        min-height: auto;
        margin: 0 3px 0 0;
        border: 1px solid #999;
        border-radius: 2px;
        cursor: pointer;
        display: inline-block;
        position: relative;
        appearance: none;
        -moz-appearance: none;
        -webkit-appearance: none;
        transition: all 0.3s ease;
    }
    .form-horizontal .checkbox:before{
        content: '';
        height: 6px;
        width: 12px;
        border-bottom: 2px solid #fff;
        border-left: 2px solid #fff;
        opacity: 1;
        transform: rotate(-45deg);
        position: absolute;
        left: 2px;
        top: 2.5px;
        transition: all 0.3s ease;
    }
    .form-horizontal .checkbox:checked{
        background-color: #4E4C97;
        border-color: #4E4C97;
    }
    .form-horizontal .checkbox:checked:before{ opacity: 1; }
    .form-horizontal .checkbox:not(:checked):before{ opacity: 0; }
    .form-horizontal .checkbox:focus{ outline: none; }
    .form-horizontal .btn{
        color: #fff;
        background-color: #4E4C97;
        font-size: 13px;
        font-weight: 600;
        letter-spacing: 0.5px;
        text-transform: capitalize;
        width: 130px;
        padding: 11px;
        margin: 0 10px 10px 0;
        border: 2px solid #4E4C97;
        border-radius: 15px;
        display: inline-block;
        transition: all 0.3s ease 0s;
    }
    .form-horizontal .btn.signin{
        color: #4E4C97;
        background-color: #fff;
    }
    .form-horizontal .btn:hover,
    .form-horizontal .btn:focus{
        color: #4E4C97;
        background-color: #fff;
        box-shadow: 0 0 5px #4E4C97, 0 0 15px #4E4C97 inset;
    }
    .form-horizontal .btn.signin:hover,
    .form-horizontal .btn.signin:focus{
        text-shadow: 3px 3px rgba(0,0,0,0.3);
        box-shadow: 0 0 5px #4E4C97;
    }
</style>

<div class="container-fluid">

    <div class="offset-md-4 col-md-4 offset-sm-3 col-sm-6">
        <div class="form-container">
            <h3 class="title">Create Account</h3>
            <ul class="social-links">
                <li><a href=""><i class="fab fa-google"></i></a></li>
                <li><a href=""><i class="fab fa-facebook-f"></i></a></li>
                <li><a href=""><i class="fab fa-twitter"></i></a></li>
            </ul>
            <span class="description">or use you email for registration:</span>
            <form class="form-horizontal">
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Login">
                </div>
                <div class="form-group">
                    <input type="email" class="form-control" placeholder="Email">
                </div>
                <div class="form-group">
                    <input type="password" class="form-control" placeholder="Password">
                </div>
                <div class="form-group">
                    <input type="text" class="form-control" placeholder="Age">
                </div>
                <div class="form-group">
                    <input type="checkbox" class="checkbox">
                    <span class="check-label">I agree to the <a href="">Terms</a> and <a href="">Privacy Policy.</a></span>
                </div>
                <button class="btn signup">Sign up</button>
                <button class="btn signin">Sign in</button>
            </form>
        </div>
    </div>

</div>


<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js"
        integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.min.js"
        integrity="sha384-Rx+T1VzGupg4BHQYs2gCW9It+akI2MM/mndMCy36UVfodzcJcF0GGLxZIzObiEfa"
        crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.1/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-HwwvtgBNo3bZJJLYd8oVXjrBZt8cqVSpeBNS5n7C8IVInixGAoxmnlMuBnhbgrkm"
        crossorigin="anonymous"></script>
</body>
</html>
