package externalxpath;

public class AmazonXpath 
{
	   // login test..
	public static final String signin = "//*[@id=\"nav-link-accountList-nav-line-1\"]";
   // public static final String userid = "//*[@id=\"ap_email\"]";
	public static final String userid = "//*[@type = 'email']";
    public static final String ctnbtn = "//*[@id=\"continue\"]";
    public static final String err1 = "//*[@id=\"auth-email-invalid-claim-alert\"]/div/div";
   // public static final String password = "//*[@id=\"ap_password\"]";
    public static final String password = "//*[@type = 'password']";
    public static final String submit = "//*[@id=\"signInSubmit\"]";
    public static final String err2 = "//*[@id=\"auth-error-message-box\"]/div/div/ul/li/span";

    // search
    public static final String searchtxtbox = "//*[@id=\"twotabsearchtextbox\"]";
    public static final String productlink = "//*[@class = 'a-size-base-plus a-spacing-none a-color-base a-text-normal']";
}
