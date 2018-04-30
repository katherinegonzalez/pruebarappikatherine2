package com.katherine.pruebarappi2.util;

import com.google.gson.Gson;
import com.katherine.pruebarappi2.model.GeneralResponse;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertGsonTest {

    @Test
    public void serializingGson() {

        GeneralResponse generalResponse = new GeneralResponse();
        Gson gson = new Gson();
        String json = gson.toJson(generalResponse);
        assertNotNull(json);
    }

    @Test
    public void deserializingGson() {
        String json = "{\"kind\": \"Listing\", \"data\": {\"modhash\": \"\", \"dist\": 25, \"children\": [{\"kind\": \"t5\", \"data\": {\"suggested_comment_sort\": null, \"hide_ads\": false, \"banner_img\": \"https://b.thumbs.redditmedia.com/PXt8GnqdYu-9lgzb3iesJBLN21bXExRV1A45zdw4sYE.png\", \"user_flair_text\": null, \"submit_text_html\": \"www\", \"user_flair_position\": \"right\", \"user_is_banned\": null, \"wiki_enabled\": true, \"show_media\": false, \"id\": \"2qh1i\", \"display_name_prefixed\": \"r/AskReddit\", \"user_is_muted\": null, \"user_can_flair_in_sr\": null, \"display_name\": \"AskReddit\", \"header_img\": \"https://a.thumbs.redditmedia.com/IrfPJGuWzi_ewrDTBlnULeZsJYGz81hsSQoQJyw6LD8.png\", \"description_html\": \"djfkdsjh\", \"title\": \"Ask Reddit...\", \"collapse_deleted_comments\": true, \"user_has_favorited\": null, \"public_description\": \"/r/AskReddit is the place to ask and answer thought-provoking questions.\", \"over18\": false, \"public_description_html\": \"&lt;!-- SC_OFF --&gt;&lt;div class=\\\"md\\\"&gt;&lt;p&gt;&lt;a href=\\\"/r/AskReddit\\\"&gt;/r/AskReddit&lt;/a&gt; is the place to ask and answer thought-provoking questions.&lt;/p&gt;\\n&lt;/div&gt;&lt;!-- SC_ON --&gt;\", \"created\": 1201261935.0, \"allow_videos\": false, \"spoilers_enabled\": true, \"icon_size\": [256, 256], \"audience_target\": \"stories\", \"notification_level\": null, \"active_user_count\": null, \"icon_img\": \"https://b.thumbs.redditmedia.com/EndDxMGB-FTZ2MGtjepQ06cQEkZw_YQAsOUudpb9nSQ.png\", \"header_title\": \"Ass Credit\", \"description\": \"hatdsf\", \"submit_text\": \"dskReddit\", \"submit_link_label\": null, \"accounts_active\": null, \"public_traffic\": false, \"header_size\": [125, 73], \"subscribers\": 19103762, \"user_flair_css_class\": null, \"submit_text_label\": \"Ask a question\", \"whitelist_status\": \"all_ads\", \"link_flair_position\": \"right\", \"user_sr_flair_enabled\": null, \"lang\": \"es\", \"user_is_moderator\": null, \"is_enrolled_in_new_modmail\": null, \"key_color\": \"#222222\", \"name\": \"t5_2qh1i\", \"user_flair_enabled_in_sr\": false, \"allow_videogifs\": false, \"url\": \"/r/AskReddit/\", \"quarantine\": false, \"wls\": 6, \"created_utc\": 1201233135.0, \"banner_size\": [1280, 384], \"user_is_contributor\": null, \"allow_discovery\": true, \"accounts_active_is_fuzzed\": false, \"advertiser_category\": \"Lifestyles\", \"user_sr_theme_enabled\": true, \"link_flair_enabled\": true, \"allow_images\": true, \"show_media_preview\": true, \"comment_score_hide_mins\": 60, \"subreddit_type\": \"public\", \"submission_type\": \"self\", \"user_is_subscriber\": null}}],\"after\": \"t5_2qh16\",\"before\": null}}";
        GeneralResponse generalResponse = new Gson().fromJson(json, GeneralResponse.class);
        assertFalse(generalResponse.getData().getChildren().isEmpty());
    }
}