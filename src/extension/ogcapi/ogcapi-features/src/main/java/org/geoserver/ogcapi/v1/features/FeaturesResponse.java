/* (c) 2019 Open Source Geospatial Foundation - all rights reserved
 * This code is licensed under the GPL 2.0 license, available at the root
 * application directory.
 */

package org.geoserver.ogcapi.v1.features;

import com.fasterxml.jackson.annotation.JsonIgnoreType;
import javax.xml.bind.annotation.XmlTransient;
import org.eclipse.emf.ecore.EObject;
import org.geoserver.ogcapi.AbstractDocument;
import org.geoserver.wfs.request.FeatureCollectionResponse;

/**
 * A Features response that contains both the WFS request and response, to help reusing the traditional WFS output
 * formats
 */
@JsonIgnoreType // not meant for jackson serialization
@XmlTransient
public class FeaturesResponse extends AbstractDocument {

    private final EObject request;
    private final FeatureCollectionResponse response;

    public FeaturesResponse(EObject request, FeatureCollectionResponse response) {
        this.request = request;
        this.response = response;
    }

    public EObject getRequest() {
        return request;
    }

    public FeatureCollectionResponse getResponse() {
        return response;
    }
}
