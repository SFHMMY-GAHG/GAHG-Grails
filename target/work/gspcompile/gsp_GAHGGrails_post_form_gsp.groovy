import spydi2kood.Post
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_GAHGGrails_post_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/post/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: postInstance, field: 'username', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("post.username.label"),'default':("Username")],-1)
printHtmlPart(2)
invokeTag('textField','g',10,['name':("username"),'required':(""),'value':(postInstance?.username)],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: postInstance, field: 'post', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("post.post.label"),'default':("Post")],-1)
printHtmlPart(2)
invokeTag('textField','g',19,['name':("post"),'required':(""),'value':(postInstance?.post)],-1)
printHtmlPart(5)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1396818330000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
