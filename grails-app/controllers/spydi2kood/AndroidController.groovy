package spydi2kood

import grails.converters.JSON

class AndroidController {

    def index() { 
		redirect (action: "postit")
	}
	def postit(){
		def res
		def remote_post=new Post()
		remote_post.username=params.username
		remote_post.post=params.post
		if(remote_post.validate()){
			remote_post.save(flush:true)
			res=[status:'ok']
		}else{
			res=[status:'fail']
		}
		render res as JSON
	}
	def show(){
		def all_posts=new Post()
		[posts:Post.all.reverse()]
	}
}
