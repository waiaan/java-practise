<%@ page contentType="text/html; charset=UTF-8" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>

    <body>
        <form action="./user" method="post">
            <!-- <label for="name">名称</label>
            <input type="text" id="name" name='name'>
            <label for="password">密码</label>
            <input type="text" id="password" name='password'>
            <label for="salary">工资</label>
            <input type="text" id="salary" name='salary'>

            <label for="accountId">账户id</label>
            <input type="text" id="accountId" name='list[0].id'>
            <label for="amount">账户金额</label>
            <input type="text" id="amount" name='list[0].amount'> -->

            <label for="accountId">账户id</label>
            <input type="text" id="accountId" name="id">
            <label for="amount">账户金额</label>
            <input type="text" id="amount" name="amount">
            <!-- <label for="date">日期</label>
            <input type="text" id="date" name="date"> -->
            <input type="submit" value="提交">
        </form>
    </body>

    </html>