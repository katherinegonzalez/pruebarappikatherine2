package com.katherine.pruebarappi2.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class DataChildren {

    @SerializedName("suggested_comment_sort")
    private String suggestedCommentSort;
    @SerializedName("hide_ads")
    private Boolean hideAds;
    @SerializedName("banner_img")
    private String bannerImg;
    @SerializedName("user_flair_text")
    private String userFlairText;
    @SerializedName("submit_text_html")
    private String submitTexthtml;
    @SerializedName("user_flair_position")
    private String userFlairPosition;
    @SerializedName("user_is_banned")
    private Boolean userIsBanned;
    @SerializedName("wiki_enabled")
    private Boolean wikiEnabled;
    @SerializedName("show_media")
    private Boolean showMedia;
    @SerializedName("id")
    private String id;
    @SerializedName("display_name_prefixed")
    private String displayNamePrefixed;
    @SerializedName("user_is_muted")
    private Boolean userIsMuted;
    @SerializedName("user_can_flair_in_sr")
    private Boolean userCanFlairInSr;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("header_img")
    private String headerImg;
    @SerializedName("description_html")
    private String descriptionHtml;
    @SerializedName("title")
    private String title;
    @SerializedName("collapse_deleted_comments")
    private Boolean collapseDeletedComments;
    @SerializedName("user_has_favorited")
    private Boolean userHasFavorited;
    @SerializedName("public_description")
    private String publicDescription;
    @SerializedName("over18")
    private Boolean over18;
    @SerializedName("public_description_html")
    private String publicDescriptionHtml;
    @SerializedName("created")
    private Long created;
    @SerializedName("allow_videos")
    private Boolean allowVideos;
    @SerializedName("spoilers_enabled")
    private Boolean spoilersEnabled;
    @SerializedName("icon_size")
    private List<Integer> iconSize;
    @SerializedName("audience_target")
    private String audienceTarget;
    @SerializedName("notification_level")
    private Integer notificationLevel;
    @SerializedName("active_user_count")
    private Object activeUserCount;
    @SerializedName("icon_img")
    private String iconImg;
    @SerializedName("header_title")
    private String headerTitle;
    @SerializedName("description")
    private String description;
    @SerializedName("submit_text")
    private String submitText;
    @SerializedName("submit_link_label")
    private String submitLinkLabel;
    @SerializedName("accounts_active")
    private String accountsActive;
    @SerializedName("public_traffic")
    private Boolean publicTraffic;
    @SerializedName("header_size")
    private List<Integer> headerSize;
    @SerializedName("subscribers")
    private Long subscribers;
    @SerializedName("user_flair_css_class")
    private Object userFlairCssClass;
    @SerializedName("submit_text_label")
    private String submitTextLabel;
    @SerializedName("whitelist_status")
    private String whitelistStatus;
    @SerializedName("link_flair_position")
    private String linkFlairPosition;
    @SerializedName("user_sr_flair_enabled")
    private Boolean userSrFlairEnabled;
    @SerializedName("lang")
    private String lang;
    @SerializedName("user_is_moderator")
    private Boolean userIsModerator;
    @SerializedName("is_enrolled_in_new_modmail")
    private Boolean isEnrolledInNewModmail;
    @SerializedName("key_color")
    private String keyColor;
    @SerializedName("name")
    private String name;
    @SerializedName("user_flair_enabled_in_sr")
    private Boolean userFlairEnabledInSr;
    @SerializedName("allow_videogifs")
    private Boolean allowVideogifs;
    @SerializedName("url")
    private String url;
    @SerializedName("quarantine")
    private Boolean quarantine;
    @SerializedName("wls")
    private Integer wls;
    @SerializedName("created_utc")
    private Long createdUtc;
    @SerializedName("banner_size")
    private List<Integer> bannerSize;
    @SerializedName("user_is_contributor")
    private Boolean userIsContributor;
    @SerializedName("allow_discovery")
    private Boolean allowDiscovery;
    @SerializedName("accounts_active_is_fuzzed")
    private Boolean accountsActiveIsFuzzed;
    @SerializedName("advertiser_category")
    private String advertiserCategory;
    @SerializedName("user_sr_theme_enabled")
    private Boolean userSrThemeEnabled;
    @SerializedName("link_flair_enabled")
    private Boolean linkFlairEnabled;
    @SerializedName("allow_images")
    private Boolean allowImages;
    @SerializedName("show_media_preview")
    private Boolean showMediaPreview;
    @SerializedName("comment_score_hide_mins")
    private Integer commentScoreHideMins;
    @SerializedName("subreddit_type")
    private String subredditType;
    @SerializedName("submissionType")
    private String submission_type;
    @SerializedName("user_is_subscriber")
    private Boolean userIsSubscriber;

    public DataChildren() {
    }

    public String getSuggestedCommentSort() {
        return suggestedCommentSort;
    }

    public void setSuggestedCommentSort(String suggestedCommentSort) {
        this.suggestedCommentSort = suggestedCommentSort;
    }

    public Boolean getHideAds() {
        return hideAds;
    }

    public void setHideAds(Boolean hideAds) {
        this.hideAds = hideAds;
    }

    public String getBannerImg() {
        return bannerImg;
    }

    public void setBannerImg(String bannerImg) {
        this.bannerImg = bannerImg;
    }

    public String getUserFlairText() {
        return userFlairText;
    }

    public void setUserFlairText(String userFlairText) {
        this.userFlairText = userFlairText;
    }

    public String getSubmitTexthtml() {
        return submitTexthtml;
    }

    public void setSubmitTexthtml(String submitTexthtml) {
        this.submitTexthtml = submitTexthtml;
    }

    public String getUserFlairPosition() {
        return userFlairPosition;
    }

    public void setUserFlairPosition(String userFlairPosition) {
        this.userFlairPosition = userFlairPosition;
    }

    public Boolean getUserIsBanned() {
        return userIsBanned;
    }

    public void setUserIsBanned(Boolean userIsBanned) {
        this.userIsBanned = userIsBanned;
    }

    public Boolean getWikiEnabled() {
        return wikiEnabled;
    }

    public void setWikiEnabled(Boolean wikiEnabled) {
        this.wikiEnabled = wikiEnabled;
    }

    public Boolean getShowMedia() {
        return showMedia;
    }

    public void setShowMedia(Boolean showMedia) {
        this.showMedia = showMedia;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDisplayNamePrefixed() {
        return displayNamePrefixed;
    }

    public void setDisplayNamePrefixed(String displayNamePrefixed) {
        this.displayNamePrefixed = displayNamePrefixed;
    }

    public Boolean getUserIsMuted() {
        return userIsMuted;
    }

    public void setUserIsMuted(Boolean userIsMuted) {
        this.userIsMuted = userIsMuted;
    }

    public Boolean getUserCanFlairInSr() {
        return userCanFlairInSr;
    }

    public void setUserCanFlairInSr(Boolean userCanFlairInSr) {
        this.userCanFlairInSr = userCanFlairInSr;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getHeaderImg() {
        return headerImg;
    }

    public void setHeaderImg(String headerImg) {
        this.headerImg = headerImg;
    }

    public String getDescriptionHtml() {
        return descriptionHtml;
    }

    public void setDescriptionHtml(String descriptionHtml) {
        this.descriptionHtml = descriptionHtml;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getCollapseDeletedComments() {
        return collapseDeletedComments;
    }

    public void setCollapseDeletedComments(Boolean collapseDeletedComments) {
        this.collapseDeletedComments = collapseDeletedComments;
    }

    public Boolean getUserHasFavorited() {
        return userHasFavorited;
    }

    public void setUserHasFavorited(Boolean userHasFavorited) {
        this.userHasFavorited = userHasFavorited;
    }

    public String getPublicDescription() {
        return publicDescription;
    }

    public void setPublicDescription(String publicDescription) {
        this.publicDescription = publicDescription;
    }

    public Boolean getOver18() {
        return over18;
    }

    public void setOver18(Boolean over18) {
        this.over18 = over18;
    }

    public String getPublicDescriptionHtml() {
        return publicDescriptionHtml;
    }

    public void setPublicDescriptionHtml(String publicDescriptionHtml) {
        this.publicDescriptionHtml = publicDescriptionHtml;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public Boolean getAllowVideos() {
        return allowVideos;
    }

    public void setAllowVideos(Boolean allowVideos) {
        this.allowVideos = allowVideos;
    }

    public Boolean getSpoilersEnabled() {
        return spoilersEnabled;
    }

    public void setSpoilersEnabled(Boolean spoilersEnabled) {
        this.spoilersEnabled = spoilersEnabled;
    }

    public List<Integer> getIconSize() {
        return iconSize;
    }

    public void setIconSize(List<Integer> iconSize) {
        this.iconSize = iconSize;
    }

    public String getAudienceTarget() {
        return audienceTarget;
    }

    public void setAudienceTarget(String audienceTarget) {
        this.audienceTarget = audienceTarget;
    }

    public Integer getNotificationLevel() {
        return notificationLevel;
    }

    public void setNotificationLevel(Integer notificationLevel) {
        this.notificationLevel = notificationLevel;
    }

    public Object getActiveUserCount() {
        return activeUserCount;
    }

    public void setActiveUserCount(Object activeUserCount) {
        this.activeUserCount = activeUserCount;
    }

    public String getIconImg() {
        return iconImg;
    }

    public void setIconImg(String iconImg) {
        this.iconImg = iconImg;
    }

    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSubmitText() {
        return submitText;
    }

    public void setSubmitText(String submitText) {
        this.submitText = submitText;
    }

    public String getSubmitLinkLabel() {
        return submitLinkLabel;
    }

    public void setSubmitLinkLabel(String submitLinkLabel) {
        this.submitLinkLabel = submitLinkLabel;
    }

    public String getAccountsActive() {
        return accountsActive;
    }

    public void setAccountsActive(String accountsActive) {
        this.accountsActive = accountsActive;
    }

    public Boolean getPublicTraffic() {
        return publicTraffic;
    }

    public void setPublicTraffic(Boolean publicTraffic) {
        this.publicTraffic = publicTraffic;
    }

    public List<Integer> getHeaderSize() {
        return headerSize;
    }

    public void setHeaderSize(List<Integer> headerSize) {
        this.headerSize = headerSize;
    }

    public Long getSubscribers() {
        return subscribers;
    }

    public void setSubscribers(Long subscribers) {
        this.subscribers = subscribers;
    }

    public Object getUserFlairCssClass() {
        return userFlairCssClass;
    }

    public void setUserFlairCssClass(Object userFlairCssClass) {
        this.userFlairCssClass = userFlairCssClass;
    }

    public String getSubmitTextLabel() {
        return submitTextLabel;
    }

    public void setSubmitTextLabel(String submitTextLabel) {
        this.submitTextLabel = submitTextLabel;
    }

    public String getWhitelistStatus() {
        return whitelistStatus;
    }

    public void setWhitelistStatus(String whitelistStatus) {
        this.whitelistStatus = whitelistStatus;
    }

    public String getLinkFlairPosition() {
        return linkFlairPosition;
    }

    public void setLinkFlairPosition(String linkFlairPosition) {
        this.linkFlairPosition = linkFlairPosition;
    }

    public Boolean getUserSrFlairEnabled() {
        return userSrFlairEnabled;
    }

    public void setUserSrFlairEnabled(Boolean userSrFlairEnabled) {
        this.userSrFlairEnabled = userSrFlairEnabled;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public Boolean getUserIsModerator() {
        return userIsModerator;
    }

    public void setUserIsModerator(Boolean userIsModerator) {
        this.userIsModerator = userIsModerator;
    }

    public Boolean getEnrolledInNewModmail() {
        return isEnrolledInNewModmail;
    }

    public void setEnrolledInNewModmail(Boolean enrolledInNewModmail) {
        isEnrolledInNewModmail = enrolledInNewModmail;
    }

    public String getKeyColor() {
        return keyColor;
    }

    public void setKeyColor(String keyColor) {
        this.keyColor = keyColor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getUserFlairEnabledInSr() {
        return userFlairEnabledInSr;
    }

    public void setUserFlairEnabledInSr(Boolean userFlairEnabledInSr) {
        this.userFlairEnabledInSr = userFlairEnabledInSr;
    }

    public Boolean getAllowVideogifs() {
        return allowVideogifs;
    }

    public void setAllowVideogifs(Boolean allowVideogifs) {
        this.allowVideogifs = allowVideogifs;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getQuarantine() {
        return quarantine;
    }

    public void setQuarantine(Boolean quarantine) {
        this.quarantine = quarantine;
    }

    public Integer getWls() {
        return wls;
    }

    public void setWls(Integer wls) {
        this.wls = wls;
    }

    public Long getCreatedUtc() {
        return createdUtc;
    }

    public void setCreatedUtc(Long createdUtc) {
        this.createdUtc = createdUtc;
    }

    public List<Integer> getBannerSize() {
        return bannerSize;
    }

    public void setBannerSize(List<Integer> bannerSize) {
        this.bannerSize = bannerSize;
    }

    public Boolean getUserIsContributor() {
        return userIsContributor;
    }

    public void setUserIsContributor(Boolean userIsContributor) {
        this.userIsContributor = userIsContributor;
    }

    public Boolean getAllowDiscovery() {
        return allowDiscovery;
    }

    public void setAllowDiscovery(Boolean allowDiscovery) {
        this.allowDiscovery = allowDiscovery;
    }

    public Boolean getAccountsActiveIsFuzzed() {
        return accountsActiveIsFuzzed;
    }

    public void setAccountsActiveIsFuzzed(Boolean accountsActiveIsFuzzed) {
        this.accountsActiveIsFuzzed = accountsActiveIsFuzzed;
    }

    public String getAdvertiserCategory() {
        return advertiserCategory;
    }

    public void setAdvertiserCategory(String advertiserCategory) {
        this.advertiserCategory = advertiserCategory;
    }

    public Boolean getUserSrThemeEnabled() {
        return userSrThemeEnabled;
    }

    public void setUserSrThemeEnabled(Boolean userSrThemeEnabled) {
        this.userSrThemeEnabled = userSrThemeEnabled;
    }

    public Boolean getLinkFlairEnabled() {
        return linkFlairEnabled;
    }

    public void setLinkFlairEnabled(Boolean linkFlairEnabled) {
        this.linkFlairEnabled = linkFlairEnabled;
    }

    public Boolean getAllowImages() {
        return allowImages;
    }

    public void setAllowImages(Boolean allowImages) {
        this.allowImages = allowImages;
    }

    public Boolean getShowMediaPreview() {
        return showMediaPreview;
    }

    public void setShowMediaPreview(Boolean showMediaPreview) {
        this.showMediaPreview = showMediaPreview;
    }

    public Integer getCommentScoreHideMins() {
        return commentScoreHideMins;
    }

    public void setCommentScoreHideMins(Integer commentScoreHideMins) {
        this.commentScoreHideMins = commentScoreHideMins;
    }

    public String getSubredditType() {
        return subredditType;
    }

    public void setSubredditType(String subredditType) {
        this.subredditType = subredditType;
    }

    public String getSubmission_type() {
        return submission_type;
    }

    public void setSubmission_type(String submission_type) {
        this.submission_type = submission_type;
    }

    public Boolean getUserIsSubscriber() {
        return userIsSubscriber;
    }

    public void setUserIsSubscriber(Boolean userIsSubscriber) {
        this.userIsSubscriber = userIsSubscriber;
    }
}
