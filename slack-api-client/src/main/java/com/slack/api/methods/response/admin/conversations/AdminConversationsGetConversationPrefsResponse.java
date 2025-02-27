package com.slack.api.methods.response.admin.conversations;

import com.slack.api.methods.SlackApiTextResponse;
import com.slack.api.model.ErrorResponseMetadata;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
public class AdminConversationsGetConversationPrefsResponse implements SlackApiTextResponse {

    private boolean ok;
    private String warning;
    private String error;
    private String needed;
    private String provided;
    private transient Map<String, List<String>> httpResponseHeaders;

    private ConversationPrefs prefs;
    private ErrorResponseMetadata responseMetadata;

    @Data
    public static class ConversationPref {
        private List<String> type;
        private List<String> user;
    }

    @Data
    public static class ConversationPrefs {
        private ConversationPref whoCanPost;
        private ConversationPref canThread;
    }
}