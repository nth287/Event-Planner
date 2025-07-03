<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Dashboard</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="container">
        <aside class="sidebar">
            <h2>Admin Dashboard</h2>
            <ul>
                <li><a href="admin.jsp">Dashboard</a></li>
                <li><a href="http://localhost:8090/Event_Planning_payment/insert.jsp">Manage Payments</a></li>
                <li><a href="#">Manage Services</a></li>
                <li><a href="#">Manage Bookings</a></li>
                <li><a href="#">Manage Reviews</a></li>
            </ul>
        </aside>
        <main class="main-content">
            <header class="header">
                <h1>Welcome to the Event Planning Dashboard</h1>
                <div class="user-info">
                    <span>Admin</span>
                    <button class="btn-class" onclick="location.href='Login.jsp'">Logout</button>
                    
                </div>
            </header>
            <section class="statistics">
                <div class="stat-card">
                    <h3>Total Events</h3>
                    <p>25</p>
                </div>
                <div class="stat-card">
                    <h3>Registered Users</h3>
                    <p>150</p>
                </div>
                <div class="stat-card">
                    <h3>Upcoming Events</h3>
                    <p>5</p>
                </div>
                <div class="stat-card">
                    <h3>Total Revenue</h3>
                    <p>$5000</p>
                </div>
            </section>
        </main>
    </div>
</body>
</html>
    