package com.home.joseki.activitiesfeednearby.model

import com.google.gson.annotations.SerializedName

data class ChildData(
    @SerializedName("secure_media")
    val secureMedia: String = "",
    @SerializedName("saved")
    val saved: String = "",
    @SerializedName("hide_score")
    val hideScore: String = "",
    @SerializedName("total_awards_received")
    val totalAwardsReceived: String = "",
    @SerializedName("subreddit_id")
    val subredditId: String = "",
    @SerializedName("score")
    val score: String = "",
    @SerializedName("num_comments")
    val numComments: String = "",
    @SerializedName("mod_reason_title")
    val modReasonTitle: String = "",
    @SerializedName("whitelist_status")
    val whitelistStatus: String = "",
    @SerializedName("steward_reports")
    val stewardReports: List<String> = ArrayList(),
    @SerializedName("spoiler")
    val spoiler: String = "",
    @SerializedName("id")
    val id: String = "",
    @SerializedName("created_utc")
    val createdUtc: String = "",
    @SerializedName("banned_at_utc")
    val bannedAtUtc: String = "",
    @SerializedName("discussion_type")
    val discussionType: String = "",
    @SerializedName("edited")
    val edited: String = "",
    @SerializedName("allow_live_comments")
    val allowLiveComments: String = "",
    @SerializedName("author_flair_background_color")
    val authorFlairBackgroundColor: String = "",
    @SerializedName("approved_by")
    val approvedBy: String = "",
    @SerializedName("domain")
    val domain: String = "",
    @SerializedName("approved_at_utc")
    val approvedAtUtc: String = "",
    @SerializedName("no_follow")
    val noFollow: String = "",
    @SerializedName("ups")
    val ups: String = "",
    @SerializedName("author_flair_type")
    val authorFlairType: String = "",
    @SerializedName("permalink")
    val permalink: String = "",
    @SerializedName("content_categories")
    val contentCategories: String = "",
    @SerializedName("wls")
    val wls: String = "",
    @SerializedName("author_flair_css_class")
    val authorFlairCssClass: String = "",
    @SerializedName("mod_reports")
    val modReports: List<String> = ArrayList(),
    @SerializedName("gilded")
    val gilded: String = "",
    @SerializedName("removal_reason")
    val removalReason: String = "",
    @SerializedName("send_replies")
    val sendReplies: String = "",
    @SerializedName("archived")
    val archived: String = "",
    @SerializedName("author_flair_text_color")
    val authorFlairTextColor: String = "",
    @SerializedName("can_mod_post")
    val canModPost: String = "",
    @SerializedName("is_self")
    val isSelf: String = "",
    @SerializedName("author_fullname")
    val authorFullname: String = "",
    @SerializedName("link_flair_css_class")
    val linkFlairCssClass: String = "",
    @SerializedName("selftext")
    val selftext: String = "",
    @SerializedName("selftext_html")
    val selftextHtml: String = "",
    @SerializedName("user_reports")
    val userReports: List<String> = ArrayList(),
    @SerializedName("is_crosspostable")
    val isCrosspostable: String = "",
    @SerializedName("clicked")
    val clicked: String = "",
    @SerializedName("author_flair_template_id")
    val authorFlairTemplateId: String = "",
    @SerializedName("url")
    val url: String = "",
    @SerializedName("parent_whitelist_status")
    val parentWhitelistStatus: String = "",
    @SerializedName("stickied")
    val stickied: String = "",
    @SerializedName("quarantine")
    val quarantine: String = "",
    @SerializedName("view_count")
    val viewCount: String = "",
    @SerializedName("link_flair_richtext")
    val linkFlairRichtext: List<String> = ArrayList(),
    @SerializedName("link_flair_background_color")
    val linkFlairBackgroundColor: String = "",
    @SerializedName("author_flair_richtext")
    val authorFlairRichtext: List<String> = ArrayList(),
    @SerializedName("over_18")
    val overEighteen: String = "",
    @SerializedName("subreddit")
    val subreddit: String = "",
    @SerializedName("suggested_sort")
    val suggestedSort: String = "",
    @SerializedName("can_gild")
    val canGild: String = "",
    @SerializedName("is_robot_indexable")
    val isRobotIndexable: String = "",
    @SerializedName("locked")
    val locked: String = "",
    @SerializedName("likes")
    val likes: String = "",
    @SerializedName("thumbnail")
    val thumbnail: String = "",
    @SerializedName("downs")
    val downs: String = "",
    @SerializedName("created")
    val created: String = "",
    @SerializedName("author")
    val author: String = "",
    @SerializedName("link_flair_text_color")
    val linkFlairTextColor: String = "",
    @SerializedName("report_reasons")
    val reportReasons: String = "",
    @SerializedName("is_video")
    val isVideo: String = "",
    @SerializedName("is_original_content")
    val isOriginalContent: String = "",
    @SerializedName("subreddit_name_prefixed")
    val subredditNamePrefixed: String = "",
    @SerializedName("mod_reason_by")
    val modReasonBy: String = "",
    @SerializedName("name")
    val name: String = "",
    @SerializedName("awarders")
    val awarders: List<String> = ArrayList(),
    @SerializedName("media_only")
    val mediaOnly: String = "",
    @SerializedName("num_reports")
    val numReports: String = "",
    @SerializedName("pinned")
    val pinned: String = "",
    @SerializedName("hidden")
    val hidden: String = "",
    @SerializedName("author_patreon_flair")
    val authorPatreonFlair: String = "",
    @SerializedName("mod_note")
    val modNote: String = "",
    @SerializedName("media")
    val media: String = "",
    @SerializedName("title")
    val title: String = "",
    @SerializedName("author_flair_text")
    val authorFlairText: String = "",
    @SerializedName("num_crossposts")
    val numCrossposts: String = "",
    @SerializedName("thumbnail_width")
    val thumbnailWidth: String = "",
    @SerializedName("link_flair_text")
    val linkFlairText: String = "",
    @SerializedName("subreddit_type")
    val subredditType: String = "",
    @SerializedName("is_meta")
    val isMeta: String = "",
    @SerializedName("subreddit_subscribers")
    val subredditSubscribers: String = "",
    @SerializedName("distinguished")
    val distinguished: String = "",
    @SerializedName("thumbnail_height")
    val thumbnailHeight: String = "",
    @SerializedName("link_flair_type")
    val linkFlairType: String = "",
    @SerializedName("all_awardings")
    val allAwardings: List<String> = ArrayList(),
    @SerializedName("visited")
    val visited: String = "",
    @SerializedName("pwls")
    val pwls: String = "",
    @SerializedName("category")
    val category: String = "",
    @SerializedName("banned_by")
    val bannedBy: String = "",
    @SerializedName("contest_mode")
    val contestMode: String = "",
    @SerializedName("is_reddit_media_domain")
    val isRedditMediaDomain: String = ""
)