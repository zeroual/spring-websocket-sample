var url = 'ws://' + window.location.host + '/websocket/marco';
var socket = new WebSocket(url);
socket.onopen = function () {
    console.log('opening');
    sayMarco();
};

socket.onclose = function () {
    console.log('Closing');
};
socket.onmessage = function (message) {
    console.log('Received message:' + message.data);
};
function sayMarco(){
    console.log('sending marco !');
    socket.send('marco');
}