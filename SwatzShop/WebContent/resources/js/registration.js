var registration = function() {
	return {
		/*defaults:{
			//to set
		},*/
		settings:{
			//to set the option values.
		},
		destroy:function(){
			registration.settings = {};
  	      },
		init : function(options) {
			//this.destroy();
			$.extend(this.settings,options);
			this.bindEvents();
		},
		bindEvents : function() {
			
			$.fn.serializeFormJSON = function () {

		        var o = {};
		        var a = this.serializeArray();
		        $.each(a, function () {
		            if (o[this.name]) {
		                if (!o[this.name].push) {
		                    o[this.name] = [o[this.name]];
		                }
		                o[this.name].push(this.value || '');
		            } else {
		                o[this.name] = this.value || '';
		            }
		        });
		        return o;
		    };
			
			$("#registrationForm").validate({
				rules : {
					firstname : "required",
					lastname : "required",
					email : {
						required : true,
						email : true
					},
					password : "required"
				},
				messages : {
					firstname : "Please enter a first name.",
					lastname : "Please enter a last name."
				},
				submitHandler : function(form) {
					$.ajax({
						url: registration.settings.url+"/addUser",
				        type: "POST",
				        data:{firstname: $("#firstname").val(),
				        	lastname: $("#lastname").val(),
				        	email : $("#email").val(),
				        	password:$("#password").val()
				        	},
				        timeout: 100000,
				        cache: false,
				        success: function(data){
				        	var response = jQuery.parseJSON(JSON.stringify(data))
				            alert("Hello "+ response.responseBody.firstname + "..your details been registered sucessfully!!");
				        },
				        done: function (e) {
				        }
				    });
					
				}
			});
			$("#swat").click(function() {
				alert("button click done!!");
			});
		},
	};
}.call(this);