<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<title>Insert title here</title>

<link rel="stylesheet"  href="styles.css">


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
    
    <br>
    <br>
    <br>


	<section class="res padding-x center column w-100">
         <form action= "InsertServlet" method="POST" class="res-form center column g-2" style="margin-top:50px;">
         <h2>Payment Details</h2>
            <!-- form-content -->
            <div class="form-container between g-5 w-100">
               <div class="left flex column g-3">
                  <!-- id -->
                  <div class="name flex column">
                     <label for="eventid">Event ID</label>
                     <input type="text" name="eventid" required/>
                  </div>
                  <!-- name -->
                  <div class="name flex column">
                     <label for="eventname">Event Name</label>
                     <input type="text" name="eventname" required/>
                  </div>
                  <!-- date -->
                  <div class="date flex column">
                     <label for="eventdate">Date</label>
                     <input type="date" name="eventdate" required />
                  </div>
                  <!-- amount -->
                  <div class="email flex column">
                     <label for="amount">Amount</label>
                     <input type="text" name="amount" required />
                  </div>
                  <!-- count -->
                  <div class="count flex column">
                     <label for="status">Status</label>
                     <input type="text" name="status" required/>
                  </div>
               </div>
               
              </div>
            <!-- button -->
            <div class="w-100 center g-2">
               <input type="submit" name="paymentBtn" value="Add Payment" class="pay-btn" />
            </div>


         </form>
      </section>
      
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