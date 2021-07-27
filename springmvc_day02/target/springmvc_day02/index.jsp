<%@ page contentType="text/html;charset=UTF-8" language="java" %>
    <html>

    <body>
        <h2>Hello World!</h2>
        <a href="user/testString">testString</a>
        <button id="testJson">test json</button>
        <script src="./js/jquery-3.6.0.js"></script>
        <script>
            $('#testJson').click(() => {
                $.ajax({
                    url: './user/testString',
                    method: 'post',
                    contentType: 'application/json;charset=utf-8',
                    data: '{ "username": "Tom", "age": 41,"password":445566 }',
                    dataType: 'json',
                    success(res) {
                        console.log(res)
                    }
                })
            })
        </script>
    </body>

    </html>