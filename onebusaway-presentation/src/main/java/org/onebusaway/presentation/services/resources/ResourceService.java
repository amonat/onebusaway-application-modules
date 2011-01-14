package org.onebusaway.presentation.services.resources;

import java.util.List;

public interface ResourceService {

  public String getExternalUrlForResource(String resourcePath);

  public String getExternalUrlForResources(List<String> resourcePaths);
  
  public String getExternalUrlForResources(String resourceId, List<String> resourcePaths);

  public Resource getLocalResourceForExternalId(String externalId);
}