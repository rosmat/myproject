package com.mycompany;

import org.apache.wicket.RuntimeConfigurationType;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.settings.RequestCycleSettings;
import plaintext.PlainTextReference;

/**
 * Application object for your web application.
 * If you want to run this application without deploying, run the Start class.
 *
 */
public class WicketApplication extends WebApplication
{
    /**
     * @see org.apache.wicket.Application#getHomePage()
     */
    @Override
    public Class<ProductsPage> getHomePage()
    {
        return ProductsPage.class;
    }

    /**
     * @see org.apache.wicket.Application#init()
     */
    @Override
    public void init()
    {
        super.init();

        // add your configuration here
        mountPage("products", ProductsPage.class);
        mountResource("/plaintext", new PlainTextReference());

        // disable response caching
        RequestCycleSettings requestCycleSettings = getRequestCycleSettings();
        requestCycleSettings.setBufferResponse(false);
    }

    @Override
    public RuntimeConfigurationType getConfigurationType() {
        return RuntimeConfigurationType.DEPLOYMENT;
    }
}
