package fi.timi.samltest;

import org.apache.log4j.Logger;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.saml.SAMLCredential;
import org.springframework.security.saml.userdetails.SAMLUserDetailsService;

public class TestUserDetails implements SAMLUserDetailsService {
	
	final static Logger logger = Logger.getLogger(TestUserDetails.class);

	@Override
	public Object loadUserBySAML(SAMLCredential cred) throws UsernameNotFoundException {
		logger.info("entering loadUserBySAML(" + cred.toString() + ")");
		return cred.getAttributeAsString("accountID");
	}
}