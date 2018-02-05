// Main.js
var count = 0;

var img1 = "<img src='images/image01-800x600-.jpg' alt='Pic1'>";
var img2 = "<img src='images/image02-800x600-.jpg' alt='Pic1'>";
var img3 = "<img src='images/image03-800x600-.jpg' alt='Pic1'>";
var img4 = "<img src='images/image04-800x600-.jpg' alt='Pic1'>";
var img5 = "<img src='images/image05-800x600-.jpg' alt='Pic1'>";
var img6 = "<img src='images/image06-800x600-.jpg' alt='Pic1'>";
var img7 = "<img src='images/image07-800x600-.jpg' alt='Pic1'>";
var img8 = "<img src='images/image08-800x600-.jpg' alt='Pic1'>";
var img9 = "<img src='images/image09-800x600-.jpg' alt='Pic1'>";
var img10 = "<img src='images/image10-800x600-.jpg' alt='Pic1'>";
var img11 = "<img src='images/image11-800x600-.jpg' alt='Pic1'>";
var img12 = "<img src='images/image12-800x600-.jpg' alt='Pic1'>";

var picarray = [img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11,img12];


function Next(){
// document.write(picarray);
	for (var i = count; i <= 11; i++) {
		document.getElementById('wripper').innerHTML = picarray[i]; 
			return count++;
		}
}

function Prev(){

	for (var i = count; i > -1; i--) {
		document.getElementById('wripper').innerHTML = picarray[i]; 
		return count--;
	}	
}