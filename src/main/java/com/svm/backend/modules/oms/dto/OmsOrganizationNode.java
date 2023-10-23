package com.svm.backend.modules.oms.dto;

import lombok.Getter;
import lombok.Setter;
import com.svm.backend.modules.oms.model.OmsOrganization;

import java.util.List;

/**
 * @author kevin
 */
@Getter
@Setter
public class OmsOrganizationNode extends OmsOrganization {

    private List<OmsOrganizationNode> children;
}
