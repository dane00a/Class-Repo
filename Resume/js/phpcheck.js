var x = 0;
  if (x <1){
    phpcheck();
    x++;
  }
function phpcheck(){
  if (document.getElementById("footer") === true){
    window.alert("YES");
  }
  else{
    window.alert("Enable PHP for the navigation bar to work! DO IT! DO IT NOW!");
  }
}
