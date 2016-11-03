package com.github.jasminb.jsonapi;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.jasminb.jsonapi.models.AlbumDTO;
import com.github.jasminb.jsonapi.models.MediaDTO;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Smoke test for extracting attributes from a Relationship Meta into parent object field
 *
 * @author rlazar
 */
public class ExtractMetaFromRelationshipTest {
	private ResourceConverter resourceConverter;

	@Before
	public void setup() {
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		resourceConverter = new ResourceConverter(mapper, AlbumDTO.class, MediaDTO.class);
	}

	@Test
	public void testExtraction() throws IOException {
		InputStream data = IOUtils.getResource("album.json");

		JSONAPIDocument<AlbumDTO> albumDocument = resourceConverter.readDocument(data, AlbumDTO.class);

		AlbumDTO album = albumDocument.get();
		Assert.assertNotNull(album);
		Assert.assertEquals(album.getCoverMediaUri(), "http://localhost:3000//images/media1.jpg");
	}
}
