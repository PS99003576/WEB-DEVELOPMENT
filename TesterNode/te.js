var http = require('http');
http.createServer(function (req, res) {
res.writeHead(200, {'Content-Type': 'text/html'});
res.write('Hello World !');
res.write("Giving data from the server");
res.end();
}).listen(3306);
