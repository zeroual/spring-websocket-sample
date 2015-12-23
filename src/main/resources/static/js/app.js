var url = 'ws://' + window.location.host + '/websocket/ping';
var socket = new WebSocket(url);
socket.onopen = function () {
    console.log('opening');
    ping();
};

socket.onclose = function () {
    console.log('Closing');
};
socket.onmessage = function (message) {
    console.log('Received message:' + message.data);
    $(".panel-body ul").append('<li class="list-group-item bg-info"> the server respond : '+message.data+'</li>');
    setTimeout(function(){ping()}, 2000);
};
function ping(){
    console.log('pign the server');
    $(".panel-body ul").append('<li class="list-group-item"> i ping the server</li>');
    socket.send('ping');
}