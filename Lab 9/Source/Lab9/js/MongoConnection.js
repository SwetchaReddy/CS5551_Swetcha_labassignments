var MongoClient = require('mongodb').MongoClient;
var assert = require('assert');
var url = 'mongodb://Swetcha:123456@ds125335.mlab.com:25335/asedemo';
MongoClient.connect(url, function(err, db) {
    assert.equal(null, err);
    console.log("Connected correctly to server.");
    db.close();
});
