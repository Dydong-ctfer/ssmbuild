<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改书籍</title>
    <link href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="page-header">
                <h1>
                    <small>修改书籍</small>
                </h1>
            </div>
        </div>
    </div>

    <form action="${pageContext.request.contextPath}/book/updateBook" method="post">
    <%--    利用hidden传递id    --%>
        <input type="hidden" name="bookId" value="${books.bookId}">

        <div class="form-group">
            <label>书籍名称</label>
            <input type="text" class="form-control" name="bookName" value="${books.bookName}" required>
        </div>

        <div class="form-group">
            <label>书籍数量</label>
            <input type="text" class="form-control" name="bookCounts" value="${books.bookCounts}" required>
        </div>

        <div class="form-group">
            <label>书籍描述</label>
            <input type="text" class="form-control" name="detail" value="${books.detail}" required>
        </div>

        <button type="submit" class="btn btn-default">Submit</button>
    </form>

</div>
</body>
</html>
