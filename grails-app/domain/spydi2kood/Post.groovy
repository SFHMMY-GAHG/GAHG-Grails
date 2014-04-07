package spydi2kood

class Post {
String username
String post
Date dateCreated
    static constraints = {
		username(nullable:false,blank:false)
		post(nullable:false,blank:false)
		
    }
	static mapping = {
		post type: 'text'
	}
}
