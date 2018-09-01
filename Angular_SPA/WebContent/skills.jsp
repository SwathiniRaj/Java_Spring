<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script
	src="https://ajax.googleapis.com/ajax/libs/angularjs/1.6.9/angular.min.js"></script>
<style>
.pointer {
	cursor: pointer;
}

.font_red {
	color: red;
}

.table_border {
	border: 1px solid black;
}

.padding-left {
	padding-left: 103px;
}

.padding_10 {
	padding: 10px;
}

.margin_right {
	margin-right: 12px;
}
</style>
<script>
	var app = angular.module("skillsList", []);
	app.controller("techCtrl", function($scope) {
		$scope.products = [ "Java", "Jquery", "C++" ];
		$scope.addTech = function() {
			$scope.error = "";
			if (!$scope.addSkill) {
				return;
			}
			if ($scope.products.indexOf($scope.addSkill) == -1) {
				$scope.products.push($scope.addSkill);
			} else {
				$scope.error = "This skill is already in your list.";
			}
		}
		$scope.removeTech = function(x) {
			$scope.errortext = "";
			$scope.products.splice(x, 1);
		}
	});
</script>
<title>Area of Interest</title>
</head>
<body>
	<div ng-app="skillsList" ng-cloak ng-controller="techCtrl">
		<div class="container">
			<header>
			<h3>Skills List</h3>
			</header>
			<div>
			<table class="table_border">
				<tr>
					<li ng-repeat="x in products" class="padding-right">{{x}}<span
						class="padding-left pointer" ng-click="removeTech($index)">×</span></li>
				</tr>
			</table>
			</div>
			<br />
			<br />
			<div class="col-md-6">
				<div class="col-md-3">
					<input placeholder="Area of Interest" ng-model="addSkill"
						class="padding_10">
				</div>
				<div class="col-md-1 padding-left">
					<button ng-click="addTech()" class=".btn-success">Add</button>
				</div>
			</div>
			<br />
			<br />
			<br />
			<div class="font_red">{{error}}</div>
		</div>
	</div>
</body>
</html>