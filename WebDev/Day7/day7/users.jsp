<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*" %>
<%! 
public void init(){
	System.out.println("init");
}
ArrayList<String> list = new ArrayList<String>();
{ list.add("nau");
 list.add("akh");
}
%>				
<%
String username = request.getParameter("username");
boolean flag=false;
for(String user : list){
	if(user.equals(username)){
  flag = true;
  break;
 }
}
// list.forEach((x)->{
// 	if(x.equals(username)){
// 		flag = true;
// 		}
// });
if(flag==true){
	out.print("0");
}else{
	out.print("1");
 //out.println("Welcome to the world of Java");
}
	System.out.println("Welcome to Server of CDAC");
	//out.println("Welcome to the world of Java");
%>

