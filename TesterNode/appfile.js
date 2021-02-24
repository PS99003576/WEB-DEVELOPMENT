var fs = require('fs');
fs.appendFile('test1.txt', 'Hello append!', (err) => { 
    if (err) throw err;
    fs.readFile('test1.txt',(error,input) =>{
        console.log('Saved!');
    });

})