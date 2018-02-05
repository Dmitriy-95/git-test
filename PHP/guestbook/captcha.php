<?php
	// echo (letters());
	function letters(){
		header ("Content-type: image/png");

		$let = 'qwertyuiopasdfghjklzxcvbnm';
		$lonCap = rand(4, 6);
		$line = '';

		for ($i=0; $i < $lonCap; $i++) { 
			$line .= substr($let, rand(0, 25) -1, 1);	
		}

		$img = imagecreate(100, 40);
		$black = imagecolorallocate ($img, 18, 24, 36);
		$white = imagecolorallocate ($img, 192, 213, 250);
		imagettftext ($img, 20, 0, 10, 20, $white, "fonts/IndieFlower.ttf", $line);
		imagepng ($img);
		imagedestroy ($img);
	
		// return ($img);
	}

	$cookie = md5($line);
	$cookietime = time()+120;
	setcookie("captcha", $cookie, $cookietime);

	letters()
?>
