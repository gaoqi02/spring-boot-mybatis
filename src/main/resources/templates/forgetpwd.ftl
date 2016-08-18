<!DOCTYPE html>
<html><head><meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>厂商管理后台修改密码</title>
<link rel="icon" href="http://123.57.23.176:8080/ec-web/favicon.ico" type="image/x-icon">
<link rel="shortcut icon" href="http://123.57.23.176:8080/ec-web/favicon.ico" type="image/x-icon">

<style type="text/css">
@charset "UTF-8";
html,body,div,span,iframe,h1,h2,h3,h4,h5,h6,p,blockquote,pre,a,address,big,cite,code,del,em,font,img,ins,small,strong,var,b,u,i,center,dl,dt,dd,ol,ul,li,fieldset,form,label,legend{margin:0;padding:0;font-family:"Helvetica Neue",Helvetica,Arial,sans-serif}
strong,b{font-weight:bold}
img{border:0 none}
body{background:#fff;font-size:12px;color:#666}
h1,h2,h3,h4,h5,h6{font-size:12px}
ol,ul,li{list-style:none}
a{color:#666;text-decoration:none;cursor:pointer;outline:none}
input,textarea{outline:none}
:focus{outline:none;-moz-outline:none}
a:hover{color:#5e0000;text-decoration:underline}
body{background:#ffffff;-webkit-font-smoothing:antialiased;font-family:"Lucida Grande","Hiragino Sans GB","Hiragino Sans GB W3"}
.wrapper .wrapper-cont{margin:0 auto;width:990px}
.wide .wrapper .wrapper-cont{width:1190px}
a{color:#298cd2}
a:hover{color:#298cd2;text-decoration:underline}
.text-muted{color:rgba(0,0,0,0.38) !important}
.clearfix:after{clear:both;content:".";display:block;height:0;visibility:hidden}
.form-row-legend{background:#eeeeee;height:40px;line-height:40px;padding-left:18px;font-size:14px;color:rgba(0,0,0,0.87);font-weight:bold;margin:30px 0}
.form-row{position:relative;margin:20px 0}
.form-row .form-row-header{width:190px;position:absolute;left:0;top:0;text-align:right;line-height:38px;font-size:14px}
.form-row .form-row-cont{margin-left:200px;line-height:38px}
.form-row .form-row-cont select{font-size:14px;color:rgba(0,0,0,0.87);height:38px;border:1px solid #dcdcdc;padding:0 10px;min-width:79px;box-sizing:border-box;vertical-align:top;margin-right:3px}
.form-row .form-row-cont input[type='text'],.form-row .form-row-cont input[type='password']{font-size:14px;color:rgba(0,0,0,0.87);height:38px;border:1px solid #dcdcdc;padding:0 10px;min-width:250px;box-sizing:border-box;vertical-align:top;margin-right:3px}
.form-row .form-row-cont input[type='text']:focus,.form-row .form-row-cont input[type='password']:focus{border-color:#00a0e9}
.form-row .form-row-cont input[type='text'].short-input,.form-row .form-row-cont input[type='password'].short-input{min-width:100px;max-width:130px}
.form-row .form-row-cont input[type='checkbox']{margin-right:5px}
.form-row .form-row-cont .img-valid-link{display:inline-block;vertical-align:top;line-height:38px;margin-right:5px}
.form-row .form-row-cont .img-valid-link img{height:36px;width:110px;border:1px solid #dddddd}
.form-row .form-row-cont .btn-sms{margin-right:3px;background:#ffffff;color:rgba(0,0,0,0.54);height:36px;line-height:38px;min-width:110px;font-size:12px;text-align:center;border:1px solid #dcdcdc}
.form-row .form-row-cont .btn-submit{background:#ff6213;color:white;height:40px;width:250px;font-size:14px;text-align:center;border:none;border-radius:2px}
.form-row .form-row-cont .btn-disabled{background:rgba(0,0,0,0.12);color:rgba(0,0,0,0.54)}
.form-row .form-row-tip{display:inline-block;font-size:12px;color:rgba(0,0,0,0.54);min-height:38px;background:#f7fbff url(/ec-web/static/images/form/tip-info.png) no-repeat 10px 10px;border:1px solid #00a0e9;padding:10px 10px 0 40px;width:250px;box-sizing:border-box;vertical-align:top;line-height:18px}
.form-row .form-row-tip.multi{padding-top:5px;line-height:14px}
.form-row .hide{display:none}
.form-row .upload-item{display:inline-block;text-align:center;margin-right:48px}
.form-row .upload-item .upload-trigger{display:block;background:url(/ec-web/static/images/form/upload.png) no-repeat 0 0;width:100px;height:100px;margin:10px 0}
.form-row .upload-item p{color:rgba(0,0,0,0.54)}
.form-row.form-row-error input[type='text'],.form-row.form-row-error input[type='password']{border-color:#ff6213}
.form-row.form-row-error .form-row-tip{color:#ff6213;border-color:#ff6213;background-color:#fef9f5;background-image:url(/ec-web/static/images/form/tip-error.png)}
.form-row.form-row-success .form-row-tip{color:rgba(0,0,0,0.54);border:none;background-color:transparent;background-image:url(/ec-web/static/images/form/tip-success.png)}
.form-desc{margin:10px 215px 10px 80px;font-size:13px;line-height:24px;color:rgba(0,0,0,0.87)}
.site-header .site-header-cont{margin:30px auto;position:relative}
.site-header .site-header-cont .brand-logo{display:block;height:92px;padding-left:270px;background:url(/img/businesslogo.png) no-repeat 0 0;line-height:92px;font-size:16px;color:rgba(0,0,0,0.87);margin:0 auto;text-decoration:none;vertical-align: baseline;width: 720px;}
.footer{clear:both;margin:20px 0 0;padding:0 0 10px;background:#f5f5f5;border-top:1px solid #dddddd}
.footer-simple{background:none;border-top:none}
.footer .footer-cont{margin:10px auto 20px;width:990px}
.wide .footer .footer-cont{width:1190px}
.footer{text-align:center;color:rgba(0,0,0,0.54)}
.footer .footer-links{padding-top:10px;clear:both}
.footer .footer-links li{display:inline-block;display:inline\9;border-right:1px solid rgba(0,0,0,0.87);padding:0 10px;height:14px;font-size:12px;line-height:14px}
.footer .footer-links li:last-child{border-right:none}
.footer .footer-links a{color:#333}
.footer p{margin:10px 0}
body .suggest-container{border:1px solid #dadada;margin-left:-7px}
body .suggest-container ol{max-height:240px;overflow:auto}
body .suggest-container ol li{display:block;width:100%;line-height:24px;color:#333;font-size:14px;text-indent:10px}
.progress{position:absolute;right:10px;top:20px}
.progress span{display:inline-block;float:left;width:140px;position:relative;text-align:center;padding-top:20px}
.progress span strong{position:absolute;top:-12px;left:50%;margin-left:-10px;display:block;border-radius:50%;width:26px;height:26px;line-height:26px;color:#fff;text-align:center;background:#ccc;z-index:2}
.progress span i{position:absolute;top:0;display:block;width:100%;height:6px;background:#ccc}
.progress span.active strong,.progress span.active i{background:#ff6213}
.btn{display:inline-block;line-height:100%;text-align:center;cursor:pointer;border:none;background:none}
.btn:hover{text-decoration:none}
.btn-primary{background:#ff6213;color:#fff;padding:0 10px;margin:0 5px 5px 0;line-height:24px;font-size:12px;border-radius:2px}
#advanced{position:relative;overflow:visible;height:0;border-bottom:1px solid #E6E6E6;margin-bottom:20px;font-size:0}
#advanced-brand{float:right;width:656px}
.resetpw-progress{position:relative;right:10px;top:20px;right:0;top:0;height:50px;padding:20px 40px}
.resetpw-progress span{display:inline-block;float:left;width:25%;position:relative;text-align:center;padding-top:20px}
.resetpw-progress span strong{position:absolute;top:-12px;left:50%;margin-left:-10px;display:block;border-radius:50%;width:26px;height:26px;line-height:26px;color:#fff;text-align:center;background:#ccc;z-index:2;border:2px solid #fff}
.resetpw-progress span i{position:absolute;top:0;display:block;width:100%;height:6px;background:#ccc}
.resetpw-progress span.active strong,.resetpw-progress span.active i{background:#3e8cf6}
.getpwd-cont{border:1px solid rgba(0,0,0,0.12)}
.getpwd-cont .form-row-header{width:390px}
.getpwd-cont .form-row-cont{margin-left:400px}
.getpwd-cont .form-row-cont .btn{display:inline-block;font-size:14px;background:#3e8cf6;color:#fff;height:36px;line-height:38px;min-width:110px;padding:0 10px;text-align:center;border:1px solid #3e8cf6}
.getpwd-cont .form-row-cont .btn-disabled{background:#dadada;border:1px solid #dadada}
.getpwd-cont .notice-info{display:block;width:auto;max-width:360px;margin:90px auto;line-height:24px;font-size:12px;min-height:60px;background:url(/ec-web/static/images/getpwd/notice_icon.png) no-repeat 0 0;padding-left:80px}
.getpwd-cont .notice-info h2{font-size:20px;line-height:60px;color:#333;font-weight:normal}
.getpwd-cont .notice-info p{line-height:18px}
.getpwd-cont .success-info{background:url(/ec-web/static/images/getpwd/success_icon.png) no-repeat 0 0}
</style>

<body>

<div class="header">
    <div class="site-header">
        <div class="site-header-cont">
            <a href="/" class="brand-logo">· 厂商管理后台</a>
        </div>
    </div>
</div>

<div class="wrapper">
    <div class="wrapper-cont">

<div class="progress resetpw-progress">
    <span class="active"><strong>1</strong>填写登录信息<i></i></span>
    <span><strong>2</strong>验证身份<i></i></span>
    <span><strong>3</strong>设置新密码<i></i></span>
    <span><strong>4</strong>设置密码完成<i></i></span>
</div>
<!-- 最后的重置密码成功框   提示图标url设置在background: url()中即可-->
<div class="successRe getpwd-cont" style="height: 213px;display: none;">
  <div style="height: 54px;width: 300px;margin: 0 auto;line-height: 54px;font-weight: bold;background: url() no-repeat left;margin-top: 70px;"><p style="font-size: 16px;margin-left: 60px;text-align: center;">恭喜您！登录密码重置成功！</br><a href="/pwd/forget">去登录</a></p></div>
</div>
<!-- 最后的重置密码失败框  提示图标url设置在background: url()中即可 -->
<div class="failRe getpwd-cont" style="height: 213px;display: none;">
  <div style="height: 54px;width: 300px;margin: 0 auto;line-height: 54px;font-weight: bold;background: url() no-repeat left;margin-top: 70px;"><p style="font-size: 16px;margin-left: 60px">非常抱歉，登录密码重置失败。</p></div>
</div>

<!-- 第一页表单 -->
<form name="myForm" method="post" id="firstform">
<div class="getpwd-cont">
    <div class="form-row">
        <div class="form-row-header">
            用户名
        </div>
        <div class="form-row-cont">
            <input type="text" tabindex="1" id="loginName" name="userName" value="" data-valid="1,0,4">

            <div class="form-row-tip hide">输入注册时使用的用户信息</div>
        </div>
    </div>
    <div class="form-row">
        <div class="form-row-header">
            验证码
        </div>
        <div class="form-row-cont">
            <input type="text" tabindex="3" id="keyword" name="captcha" value="" class="short-input" data-valid="1">
            <a href="/captcha/get" class="img-valid-link"><img id="yzmImg" src="/captcha/get" alt="验证码"></a> <a href="/captcha/get" class="img-valid-link">换一张</a>
        </div>
    </div>
    <p style="width: 200px;margin-left: 400px;display: none;color: red;font-weight: bold;" id="firsterrortip"></p>
    <div class="form-row">
            <div class="form-row-header">
                
            </div>
            <div class="form-row-cont">
                <button class="btn btn-submit" >下一步</button>
            </div>
        </div>
</div>
</form>
<!-- 第二页表单 -->
<form name="myForm" method="post" id="secondform" style="display: none;">
<div id="uuidstore" style="display: none;"></div>
<div id="mobilephonestore" style="display: none;"></div>
<div class="getpwd-cont">
    <div class="form-row">
        <div class="form-row-header">
            已绑定手机号码
        </div>
        <div class="form-row-cont">
            <input type="text" tabindex="1" id="loginName2" name="userName" value="" data-valid="1,0,4">
        </div>
    </div>
    <div class="form-row">
        <div class="form-row-header">
            短信验证码
        </div>
        <div class="form-row-cont">
        <style type="text/css">
            a:hover{text-decoration: none;}
        </style>
            <input type="text" tabindex="3" id="keywordmobile2" name="captcha" value="" class="short-input" data-valid="1">
            <a href="/captcha/get" class="img-valid-link"><div style="width: 110px;height: 36px;line-height: 36px;text-align: center;background-color: #f1f1f1;border: 1px solid #c0c0c0;color: #000;font-size: 16px;" id="getSMS">点击获取</div></a>
        </div>
    </div>
    <p style="width: 200px;margin-left: 400px;display: none;color: red;font-weight: bold;" id="seconderrortip"></p>
    <div class="form-row">
            <div class="form-row-header">
                
            </div>
            <div class="form-row-cont">
                <button class="btn btn-submit" >下一步</button>
            </div>
        </div>
</div>
</form>
<!-- 第三页表单 -->
<form name="myForm" method="post" id="thirdform" style="display: none;">
<div class="getpwd-cont">
    <div class="form-row">
        <div class="form-row-header">
            设置密码
        </div>
        <div class="form-row-cont">
            <input type="password" tabindex="1" id="new_password" name="userName" value="" data-valid="1,0,4">
        </div>
    </div>
    <div class="form-row">
        <div class="form-row-header">
            确认密码
        </div>
        <div class="form-row-cont">
            <input type="password" tabindex="1" id="repwd" name="userName" value="" data-valid="1,0,4">
        </div>
    </div>
    <p style="width: 200px;margin-left: 400px;display: none;color: red;font-weight: bold;" id="thirderrortip"></p>
    <div class="form-row">
            <div class="form-row-header">
                
            </div>
            <div class="form-row-cont">
                <button class="btn btn-submit" >下一步</button>
            </div>
        </div>
</div>
</form>
    </div>
</div>
<!-- jQuery百度CDN -->
<script src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
//定义变量-->用于显示获取手机验证码按钮是否处于冷却状态的变量
var getSMSstatus=false
//第一页验证码刷新
  $("#firstform .form-row-cont a").on("click",function(e){
    $("#firstform .form-row-cont img").attr("src","")
    $("#firstform .form-row-cont img").attr("src","/captcha/get")
    return false
})
//帐号验证码-第一页下一步点击
$("#firstform .btn-submit").on("click",function(e){
  e.preventDefault()
 var str="/pwd?userName="+$("#firstform #loginName").val()+"&captcha="+$("#firstform #keyword").val()
$.post(str,function(msg){
  console.log(msg)
  var msgj=msg//$.parseJSON(msg)
  if(msgj.success){
    $("#firstform").hide()
    $("#secondform").show()
    $(".resetpw-progress span").eq(1).addClass("active")
  }else{
    $("#firstform .form-row-cont img").attr("src","")
    $("#firstform .form-row-cont img").attr("src","/captcha/get")
    $("#firstform #firsterrortip").html(msgj.result.errMsg).show()
  }
})
return false
})
//获取短信验证码功能，目前接口失效
$("#getSMS").on("click",function(){
if(getSMSstatus){return false}
$(this).css("color","#979797")
getSMSstatus=true
$.post("/sms/send",function(msg){
  console.log(msg)
})
setTimeout(function(){
  $("#getSMS").css("color","#000")
  getSMSstatus=false
} ,60000)
return false
})
//第2页下一步点击
$("#secondform .btn-submit").on("click",function(e){
  e.preventDefault()
  if (!(/^1[3|4|5|7|8]\d{9}$/.test($("#loginName2").val()))) {$("#seconderrortip").html("请输入正确的手机号！").show()}
 var str="/pwd/checkcode?mobile="+$("#loginName2").val()+"&sms_code="+$("#keywordmobile2").val()
$.post(str,function(msg){
  console.log(msg)
  if(msg.success){
    $("#secondform").hide()
    $("#thirdform").show()
    $(".resetpw-progress span").eq(2).addClass("active")
    $("#uuidstore").html(msg.uuid)
    $("#mobilephonestore").html($("#loginName2").val())

  }else{
    $("#seconderrortip").html(msg.msg).show()
  }
})
return false
})
//第3页下一步点击
$("#thirdform .btn-submit").on("click",function(e){
  e.preventDefault()
  if($("#new_password").val()==='' || $("#repwd").val()===''){$("#thirderrortip").html("密码不能为空！").show();return false}
  //检测密码是否少于10个字符，可以自己设定
  if($("#new_password").val().length<10 || $("#repwd").val().length<10 ){$("#thirderrortip").html("密码不能少于10个字符！").show();return false}
  if($("#new_password").val()!==$("#repwd").val()){$("#thirderrortip").html("两次密码输入不同！").show();return false}
  
 var str="/pwd/staff/change?uuid="+$("#uuidstore").html()+"&mobile="+$("#mobilephonestore").html()+"&new_password="+$("#new_password").val()+"&repwd="+$("#repwd").val()
  $.post(str,function(msg){
    console.log(msg)
    if(msg.success){
      $("#thirdform").hide()
      $(".resetpw-progress span").eq(3).addClass("active")
      $(".successRe").show()

  }else{
    $("#thirdform").hide()
    $(".failRe").show()
  }
})
return false
})

});

</script>


<div class="footer footer-simple">
    <div class="footer-cont">
        
<ul class="footer-links clearfix">
    <li> 
        <a href="http://123.57.23.176:8080/ec-web/getNewsByTypeId.html?newsTypeNo=gsjs">关于我们</a>
    </li>
    <li>
        <a target="_blank" href="http://news.multigold.com.cn/">买线网资讯</a>
    </li>
    <li>
        <a href="http://123.57.23.176:8080/ec-web/jsp/home/map.jsp">网站地图</a>
    </li>
    <li>
        <a href="http://123.57.23.176:8080/ec-web/getNewsByTypeId.html?newsTypeNo=about-us_ysxy">隐私条款</a>
    </li>
    <li>
        <a href="http://123.57.23.176:8080/ec-web/getNewsByTypeId.html?newsTypeNo=jrwm">加入我们</a>
    </li>
    <li>
        <a href="http://123.57.23.176:8080/ec-web/jsp/help/help_index.jsp">帮助中心</a>
    </li>
    <li>
        <a href="http://123.57.23.176:8080/ec-web/ecLink/linkList/1.html">友情链接</a>
    </li>
</ul>

<p>Copyright @ 2013-2050 买线网multigold.com.cn 版权所有　　　京ICP备13006376号-4 
</body></html>