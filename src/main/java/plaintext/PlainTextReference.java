package plaintext;

import org.apache.wicket.request.resource.IResource;
import org.apache.wicket.request.resource.ResourceReference;

public class PlainTextReference extends ResourceReference
{
    private static final long serialVersionUID = 1L;

    private final PlainTextResource resource = new PlainTextResource();

    public PlainTextReference()
    {
        super(PlainTextReference.class, "plaintext");
    }

    @Override
    public IResource getResource()
    {
        return resource;
    }
}
