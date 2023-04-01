package scrappy.core.issue.types;

import java.util.List;

/**
 * Contains folders and url issues
 */
public class FolderIssue extends Issue {
    public FolderIssue(String key, String summary, IssueState state, List<Issue> subIssues) {
        super(key, summary, state, subIssues);
    }
}
