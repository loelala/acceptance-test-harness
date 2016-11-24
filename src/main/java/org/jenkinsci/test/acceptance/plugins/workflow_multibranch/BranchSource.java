package org.jenkinsci.test.acceptance.plugins.workflow_multibranch;

import org.jenkinsci.test.acceptance.po.PageAreaImpl;
import org.jenkinsci.test.acceptance.po.WorkflowMultiBranchJob;

/**
 * Base type for {@link PageAreaImpl} for Branch Source.
 */
public class BranchSource extends PageAreaImpl {

    public BranchSource(WorkflowMultiBranchJob job, String path) {
        super(job, path);
    }

}