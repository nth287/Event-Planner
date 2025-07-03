<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Update Payment</title>

<link rel="stylesheet" type="text/css" href="styles2.css">


</head>
<body>
<header>
     <div id="navbar"></div>
	<script>
    fetch('navbar.jsp')
        .then(response => response.text())
        .then(data => {
            document.getElementById('navbar').innerHTML = data;
        });
	</script>
    </header>

<div class="header">
<h2>Update Payment Details</h2>
</div>

<% 
String paymentid = request.getParameter("paymentid");
String eventid = request.getParameter("eventid");
String eventname = request.getParameter("eventname");
String eventdate = request.getParameter("eventdate");
String amount = request.getParameter("amount");
String status = request.getParameter("status");

%>

 <form action="UpdateServlet" method="post" class="res-form center column g-2" style="margin-top:50px;">
        <div class="form-container between g-5 w-100">
            <div class="left flex column g-3">
                <!-- Payment ID -->
                <div class="paymentid flex column">
                    <label for="paymentid">Payment ID</label>
                    <input type="text" name="paymentid" value="<%=paymentid%>" readonly/>
                </div>
                <!-- Event ID -->
                <div class="eventid flex column">
                    <label for="eventid">Event ID</label>
                    <input type="text" name="eventid" value="<%=eventid%>" required/>
                </div>
                <!-- Event Name -->
                <div class="eventname flex column">
                    <label for="eventname">Event Name</label>
                    <input type="text" name="eventname" value="<%=eventname%>" required />
                </div>
                <!-- Event Date -->
                <div class="eventdate flex column">
                    <label for="eventdate">Event Date</label>
                    <input type="date" name="eventdate" value="<%=eventdate%>" required />
                </div>
                <!-- Amount -->
                <div class="amount flex column">
                    <label for="amount">Amount</label>
                    <input type="text" name="amount" value="<%=amount%>" required/>
                </div>
                <!-- Status -->
                <div class="status flex column">
                    <label for="status">Status</label>
                    <input type="text" name="status" value="<%=status%>" required/>
                </div>
            </div>

            
        </div>

        
        
        <!-- Submit Button -->
        <div class="w-100 center g-2">
            <input type="submit" name="paymentBtn" value="Update Payment" class="pay-btn" />
        </div>
    </form>
    <br>
      <br>
      <br>
      
      <div id="footer"></div>

    <script>
        // Load the footer HTML content
        fetch('footer.jsp')
            .then(response => response.text())
            .then(data => {
                document.getElementById('footer').innerHTML = data;
            })
            .catch(error => console.error('Error loading footer:', error));
    </script>
</body>
</html>

   