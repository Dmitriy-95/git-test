<?php
// header('Content-Type: text/html; charset=utf-8');

	if(count($_POST) > 0){

		$name = trim($_POST['name']);
		$mail = trim($_POST['mail']);
		
		$brouz = $_SERVER['HTTP_USER_AGENT'];
		// $date = date("Y-m-d H:i:s");
		$kol = strlen($name);
		
		function detectIP(){

			$IP = $_SERVER['REMOTE_ADDR'];

			if (array_key_exists('HTTP_X_FORWARDED_FOR', $_SERVER)) {

    		$IP = array_pop(explode(',', $_SERVER['HTTP_X_FORWARDED_FOR']));
			}

			return $IP;
		}

		$detIp = detectIP();

		function strTeg(){

			$coment = trim($_POST['comment']);
			$text = strip_tags($coment);

			return $text;
		}

		$comment = strTeg();


		if ($kol < 4) {
			$msg = 'нужно имя побольше';
		}

		elseif (!preg_match('|^[A-Z0-9]+$|i', $name)) {
			$msg = 'только латинские символы';
		}

		elseif (!filter_var($mail, FILTER_VALIDATE_EMAIL)) {
			$msg = 'не верный имеил';
		}

		else{
			file_put_contents('apps.txt', "$brouz-|-$detIp-|-$name-|-$mail-|-$comment\n", FILE_APPEND);

			// $db_host = 'localhost';
			// $db_username = 'Dima';
			// $db_password = 'crashtaras';
			// $db_name = 'Dima';
			// $db_charset = 'utf8';

			// $conn = new mysqli($db_host, $db_username, $db_password, $db_name);
			// if ($mysqli->connect_error) {
   //  	die('Connect Error (' . $mysqli->connect_errno . ') ' . $mysqli->connect_error);
			// }

			// $sqL = "CREATE TABLE user(
			// name VARCHAR (30) NOT NULL)";

			// $sql = "INSERT INTO users (name, mail) VALUES ($name,$mail):";

			// if ($conn->multi_query($sql) === TRUE){
			// 	echo('erger');
			// }
 		// 	$conn->close();

			echo('ваша заявка принята ожидайте');
		}
	}

	else{
		$name = '';
		$mail = '';
		$msg = 'привет оставь комент';
		
	}
?>

<form method="post">
	<input type="text" placeholder="User Name:" name="name" value="<?php echo ($name); ?>"><br/>
	<input type="text" placeholder="E-mail:" name="mail" value="<?php echo ($mail); ?>"><br/>
	<textarea name="comment" placeholder="Comments"></textarea><br/>
	<img src="captcha.php" alt="captcha"><br/>
	<input type="text" name="code" placeholder="captcha"><br/>
	<input type="submit" value="отправить">
</form>

<?php 
echo "$msg<hr>";
?>

<?php 
	
	$apps = file('apps.txt');

	echo "<table>";
	
	foreach ($apps as $line) {
		$arr = explode('-|-', $line);

		echo "<tr>";

		foreach ($arr as $one) {
			echo "<td>$one</td>";
		}
		

		// echo "$line<hr>";
		echo "</tr>";
	}

	echo "</table>";

 ?>


<style type="text/css">
	table, td{
		border: 1px solid black;
		border-collapse: collapse;
		padding: 5px;
	}
</style>






















