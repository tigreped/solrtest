package WingLongitude.test;

import org.apache.solr.client.solrj.embedded.EmbeddedSolrServer;
import org.apache.solr.core.CoreContainer;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		String url = "http://localhost:8983/solr";
		// SolrServer server = new HttpSolrServer(url);
		// SolrServer server = new ConcurrentUpdateSolrServer( url );
		String path = "/opt/solr/test";
		System.setProperty("solr.solr.home",
				path);
		// Initialize the core container:
		CoreContainer coreContainer = new CoreContainer(path);
		// Load the container
		coreContainer.load();
		// Initialize the embedded server:
		EmbeddedSolrServer server = new EmbeddedSolrServer(coreContainer, "test");
		
	}
}
