/*
 * VRChat API Documentation
 * ![VRChat API Banner](https://vrchatapi.github.io/assets/img/api_banner_1500x400.png)  # Welcome to the VRChat API  Before we begin, we would like to state this is a **COMMUNITY DRIVEN PROJECT**. This means that everything you read on here was written by the community itself and is **not** officially supported by VRChat. The documentation is provided \"AS IS\", and any action you take towards VRChat is completely your own responsibility.  The documentation and additional libraries SHALL ONLY be used for applications interacting with VRChat's API in accordance with their [Terms of Service](https://github.com/VRChatAPI), and MUST NOT be used for modifying the client, \"avatar ripping\", or other illegal activities. Malicious usage or spamming the API may result in account termination. Certain parts of the API are also more sensitive than others, for example moderation, so please read tread extra carefully and read the warnings when present.  ![Tupper Policy on API](https://i.imgur.com/yLlW7Ok.png)  Finally, use of the API using applications other than the approved methods (website, VRChat application, Unity SDK) is not officially supported. VRChat provides no guarantee or support for external applications using the API. Access to API endpoints may break **at any time, without notice**. Therefore, please **do not ping** VRChat Staff in the VRChat Discord if you are having API problems, as they do not provide API support. We will make a best effort in keeping this documentation and associated language libraries up to date, but things might be outdated or missing. If you find that something is no longer valid, please contact us on Discord or [create an issue](https://github.com/vrchatapi/specification/issues) and tell us so we can fix it.  # Getting Started  The VRChat API can be used to programmatically retrieve or update information regarding your profile, friends, avatars, worlds and more. The API consists of two parts, \"Photon\" which is only used in-game, and the \"Web API\" which is used by both the game and the website. This documentation focuses only on the Web API.  The API is designed around the REST ideology, providing semi-simple and usually predictable URIs to access and modify objects. Requests support standard HTTP methods like GET, PUT, POST, and DELETE and standard status codes. Response bodies are always UTF-8 encoded JSON objects, unless explicitly documented otherwise.  <div class=\"callout callout-error\">   <strong>🛑 Warning! Do not touch Photon!</strong><br>   Photon is only used by the in-game client and should <b>not</b> be touched. Doing so may result in permanent account termination. </div>  <div class=\"callout callout-info\">   <strong>ℹ️ API Key and Authentication</strong><br>   The API Key has always been the same and is currently <code>JlE5Jldo5Jibnk5O5hTx6XVqsJu4WJ26</code>.   Read <a href=\"#tag--authentication\">Authentication</a> for how to log in. </div>  # Using the API  For simply exploring what the API can do it is strongly recommended to download [Insomnia](https://insomnia.rest/download), a free and open-source API client that's great for sending requests to the API in an orderly fashion. Insomnia allows you to send data in the format that's required for VRChat's API. It is also possible to try out the API in your browser, by first logging in at [vrchat.com/home](https://vrchat.com/home/) and then going to [vrchat.com/api/1/auth/user](https://vrchat.com/api/1/auth/user), but the information will be much harder to work with.  For more permanent operation such as software development it is instead recommended to use one of the existing language SDKs. This community project maintains API libraries in several languages, which allows you to interact with the API with simple function calls rather than having to implement the HTTP protocol yourself. Most of these libraries are automatically generated from the API specification, sometimes with additional helpful wrapper code to make usage easier. This allows them to be almost automatically updated and expanded upon as soon as a new feature is introduced in the specification itself. The libraries can be found on [GitHub](https://github.com/vrchatapi) or following:  * [NodeJS (JavaScript)](https://www.npmjs.com/package/vrchat) * [Dart](https://pub.dev/packages/vrchat_dart) * [Rust](https://crates.io/crates/vrchatapi) * [C#](github.com/vrchatapi/vrchatapi-csharp) * [Python](https://github.com/vrchatapi/VRChatPython)  # Pagination  Most endpoints enforce pagination, meaning they will only return 10 entries by default, and never more than 100.<br> Using both the limit and offset parameters allows you to easily paginate through a large number of objects.  | Query Parameter | Type | Description | | ----------|--|------- | | `limit` | integer  | The number of objects to return. This value often defaults to 10. Highest limit is always 100.| | `offset` | integer  | A zero-based offset from the default object sorting.|  If a request returns fewer objects than the `limit` parameter, there are no more items available to return.  # Contribution  Do you want to get involved in the documentation effort? Do you want to help improve one of the language API libraries? This project is an [OPEN Open Source Project](https://openopensource.org)! This means that individuals making significant and valuable contributions are given commit-access to the project. It also means we are very open and welcoming of new people making contributions, unlike some more guarded open-source projects.  [![Discord](https://img.shields.io/static/v1?label=vrchatapi&message=discord&color=blueviolet&style=for-the-badge)](https://discord.gg/qjZE9C9fkB)
 *
 * The version of the OpenAPI document: 1.0.1
 * Contact: me@ruby.js.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.vrchatapi.model.ConfigAnnouncements;
import io.github.vrchatapi.model.ConfigDownloadUrls;
import io.github.vrchatapi.model.ConfigDynamicWorldRows;
import io.github.vrchatapi.model.ConfigEvents;
import io.github.vrchatapi.model.DeploymentGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * Config
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-23T01:00:55.302476200+02:00[Europe/Stockholm]")
public class Config {
  public static final String SERIALIZED_NAME_ADDRESS = "address";
  @SerializedName(SERIALIZED_NAME_ADDRESS)
  private String address;

  public static final String SERIALIZED_NAME_ANNOUNCEMENTS = "announcements";
  @SerializedName(SERIALIZED_NAME_ANNOUNCEMENTS)
  private Set<ConfigAnnouncements> announcements = new LinkedHashSet<ConfigAnnouncements>();

  public static final String SERIALIZED_NAME_API_KEY = "apiKey";
  @SerializedName(SERIALIZED_NAME_API_KEY)
  private String apiKey;

  public static final String SERIALIZED_NAME_APP_NAME = "appName";
  @SerializedName(SERIALIZED_NAME_APP_NAME)
  private String appName = "VrChat";

  public static final String SERIALIZED_NAME_BUILD_VERSION_TAG = "buildVersionTag";
  @SerializedName(SERIALIZED_NAME_BUILD_VERSION_TAG)
  private String buildVersionTag;

  public static final String SERIALIZED_NAME_CLIENT_API_KEY = "clientApiKey";
  @SerializedName(SERIALIZED_NAME_CLIENT_API_KEY)
  private String clientApiKey;

  public static final String SERIALIZED_NAME_CLIENT_B_P_S_CEILING = "clientBPSCeiling";
  @SerializedName(SERIALIZED_NAME_CLIENT_B_P_S_CEILING)
  private BigDecimal clientBPSCeiling;

  public static final String SERIALIZED_NAME_CLIENT_DISCONNECT_TIMEOUT = "clientDisconnectTimeout";
  @SerializedName(SERIALIZED_NAME_CLIENT_DISCONNECT_TIMEOUT)
  private BigDecimal clientDisconnectTimeout;

  public static final String SERIALIZED_NAME_CLIENT_RESERVED_PLAYER_B_P_S = "clientReservedPlayerBPS";
  @SerializedName(SERIALIZED_NAME_CLIENT_RESERVED_PLAYER_B_P_S)
  private BigDecimal clientReservedPlayerBPS;

  public static final String SERIALIZED_NAME_CLIENT_SENT_COUNT_ALLOWANCE = "clientSentCountAllowance";
  @SerializedName(SERIALIZED_NAME_CLIENT_SENT_COUNT_ALLOWANCE)
  private BigDecimal clientSentCountAllowance;

  public static final String SERIALIZED_NAME_CONTACT_EMAIL = "contactEmail";
  @SerializedName(SERIALIZED_NAME_CONTACT_EMAIL)
  private String contactEmail;

  public static final String SERIALIZED_NAME_COPYRIGHT_EMAIL = "copyrightEmail";
  @SerializedName(SERIALIZED_NAME_COPYRIGHT_EMAIL)
  private String copyrightEmail;

  public static final String SERIALIZED_NAME_CURRENT_T_O_S_VERSION = "currentTOSVersion";
  @SerializedName(SERIALIZED_NAME_CURRENT_T_O_S_VERSION)
  private BigDecimal currentTOSVersion;

  public static final String SERIALIZED_NAME_DEFAULT_AVATAR = "defaultAvatar";
  @SerializedName(SERIALIZED_NAME_DEFAULT_AVATAR)
  private String defaultAvatar;

  public static final String SERIALIZED_NAME_DEPLOYMENT_GROUP = "deploymentGroup";
  @SerializedName(SERIALIZED_NAME_DEPLOYMENT_GROUP)
  private DeploymentGroup deploymentGroup;

  public static final String SERIALIZED_NAME_DEV_APP_VERSION_STANDALONE = "devAppVersionStandalone";
  @SerializedName(SERIALIZED_NAME_DEV_APP_VERSION_STANDALONE)
  private String devAppVersionStandalone;

  public static final String SERIALIZED_NAME_DEV_DOWNLOAD_LINK_WINDOWS = "devDownloadLinkWindows";
  @SerializedName(SERIALIZED_NAME_DEV_DOWNLOAD_LINK_WINDOWS)
  private String devDownloadLinkWindows;

  public static final String SERIALIZED_NAME_DEV_SDK_URL = "devSdkUrl";
  @SerializedName(SERIALIZED_NAME_DEV_SDK_URL)
  private String devSdkUrl;

  public static final String SERIALIZED_NAME_DEV_SDK_VERSION = "devSdkVersion";
  @SerializedName(SERIALIZED_NAME_DEV_SDK_VERSION)
  private String devSdkVersion;

  public static final String SERIALIZED_NAME_DEV_SERVER_VERSION_STANDALONE = "devServerVersionStandalone";
  @SerializedName(SERIALIZED_NAME_DEV_SERVER_VERSION_STANDALONE)
  private String devServerVersionStandalone;

  public static final String SERIALIZED_NAME_DISABLE_AVATAR_COPYING = "disableAvatarCopying";
  @SerializedName(SERIALIZED_NAME_DISABLE_AVATAR_COPYING)
  private Boolean disableAvatarCopying = false;

  public static final String SERIALIZED_NAME_DISABLE_AVATAR_GATING = "disableAvatarGating";
  @SerializedName(SERIALIZED_NAME_DISABLE_AVATAR_GATING)
  private Boolean disableAvatarGating = false;

  public static final String SERIALIZED_NAME_DISABLE_COMMUNITY_LABS = "disableCommunityLabs";
  @SerializedName(SERIALIZED_NAME_DISABLE_COMMUNITY_LABS)
  private Boolean disableCommunityLabs = false;

  public static final String SERIALIZED_NAME_DISABLE_COMMUNITY_LABS_PROMOTION = "disableCommunityLabsPromotion";
  @SerializedName(SERIALIZED_NAME_DISABLE_COMMUNITY_LABS_PROMOTION)
  private Boolean disableCommunityLabsPromotion = false;

  public static final String SERIALIZED_NAME_DISABLE_EMAIL = "disableEmail";
  @SerializedName(SERIALIZED_NAME_DISABLE_EMAIL)
  private Boolean disableEmail = false;

  public static final String SERIALIZED_NAME_DISABLE_EVENT_STREAM = "disableEventStream";
  @SerializedName(SERIALIZED_NAME_DISABLE_EVENT_STREAM)
  private Boolean disableEventStream = false;

  public static final String SERIALIZED_NAME_DISABLE_FEEDBACK_GATING = "disableFeedbackGating";
  @SerializedName(SERIALIZED_NAME_DISABLE_FEEDBACK_GATING)
  private Boolean disableFeedbackGating = false;

  public static final String SERIALIZED_NAME_DISABLE_HELLO = "disableHello";
  @SerializedName(SERIALIZED_NAME_DISABLE_HELLO)
  private Boolean disableHello = false;

  public static final String SERIALIZED_NAME_DISABLE_REGISTRATION = "disableRegistration";
  @SerializedName(SERIALIZED_NAME_DISABLE_REGISTRATION)
  private Boolean disableRegistration = false;

  public static final String SERIALIZED_NAME_DISABLE_STEAM_NETWORKING = "disableSteamNetworking";
  @SerializedName(SERIALIZED_NAME_DISABLE_STEAM_NETWORKING)
  private Boolean disableSteamNetworking = true;

  public static final String SERIALIZED_NAME_DISABLE_TWO_FACTOR_AUTH = "disableTwoFactorAuth";
  @SerializedName(SERIALIZED_NAME_DISABLE_TWO_FACTOR_AUTH)
  private Boolean disableTwoFactorAuth = false;

  public static final String SERIALIZED_NAME_DISABLE_UDON = "disableUdon";
  @SerializedName(SERIALIZED_NAME_DISABLE_UDON)
  private Boolean disableUdon = false;

  public static final String SERIALIZED_NAME_DISABLE_UPGRADE_ACCOUNT = "disableUpgradeAccount";
  @SerializedName(SERIALIZED_NAME_DISABLE_UPGRADE_ACCOUNT)
  private Boolean disableUpgradeAccount = false;

  public static final String SERIALIZED_NAME_DOWNLOAD_LINK_WINDOWS = "downloadLinkWindows";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_LINK_WINDOWS)
  private String downloadLinkWindows;

  public static final String SERIALIZED_NAME_DOWNLOAD_URLS = "downloadUrls";
  @SerializedName(SERIALIZED_NAME_DOWNLOAD_URLS)
  private ConfigDownloadUrls downloadUrls;

  public static final String SERIALIZED_NAME_DYNAMIC_WORLD_ROWS = "dynamicWorldRows";
  @SerializedName(SERIALIZED_NAME_DYNAMIC_WORLD_ROWS)
  private Set<ConfigDynamicWorldRows> dynamicWorldRows = new LinkedHashSet<ConfigDynamicWorldRows>();

  public static final String SERIALIZED_NAME_EVENTS = "events";
  @SerializedName(SERIALIZED_NAME_EVENTS)
  private ConfigEvents events;

  public static final String SERIALIZED_NAME_GEAR_DEMO_ROOM_ID = "gearDemoRoomId";
  @SerializedName(SERIALIZED_NAME_GEAR_DEMO_ROOM_ID)
  private String gearDemoRoomId;

  public static final String SERIALIZED_NAME_HOMEPAGE_REDIRECT_TARGET = "homepageRedirectTarget";
  @SerializedName(SERIALIZED_NAME_HOMEPAGE_REDIRECT_TARGET)
  private String homepageRedirectTarget = "https://hello.vrchat.com";

  public static final String SERIALIZED_NAME_HOME_WORLD_ID = "homeWorldId";
  @SerializedName(SERIALIZED_NAME_HOME_WORLD_ID)
  private String homeWorldId;

  public static final String SERIALIZED_NAME_HUB_WORLD_ID = "hubWorldId";
  @SerializedName(SERIALIZED_NAME_HUB_WORLD_ID)
  private String hubWorldId;

  public static final String SERIALIZED_NAME_JOBS_EMAIL = "jobsEmail";
  @SerializedName(SERIALIZED_NAME_JOBS_EMAIL)
  private String jobsEmail;

  public static final String SERIALIZED_NAME_MESSAGE_OF_THE_DAY = "messageOfTheDay";
  @SerializedName(SERIALIZED_NAME_MESSAGE_OF_THE_DAY)
  private String messageOfTheDay;

  public static final String SERIALIZED_NAME_MODERATION_EMAIL = "moderationEmail";
  @SerializedName(SERIALIZED_NAME_MODERATION_EMAIL)
  private String moderationEmail;

  public static final String SERIALIZED_NAME_MODERATION_QUERY_PERIOD = "moderationQueryPeriod";
  @SerializedName(SERIALIZED_NAME_MODERATION_QUERY_PERIOD)
  private BigDecimal moderationQueryPeriod;

  public static final String SERIALIZED_NAME_NOT_ALLOWED_TO_SELECT_AVATAR_IN_PRIVATE_WORLD_MESSAGE = "notAllowedToSelectAvatarInPrivateWorldMessage";
  @SerializedName(SERIALIZED_NAME_NOT_ALLOWED_TO_SELECT_AVATAR_IN_PRIVATE_WORLD_MESSAGE)
  private String notAllowedToSelectAvatarInPrivateWorldMessage;

  public static final String SERIALIZED_NAME_PLUGIN = "plugin";
  @SerializedName(SERIALIZED_NAME_PLUGIN)
  private String plugin;

  public static final String SERIALIZED_NAME_RELEASE_APP_VERSION_STANDALONE = "releaseAppVersionStandalone";
  @SerializedName(SERIALIZED_NAME_RELEASE_APP_VERSION_STANDALONE)
  private String releaseAppVersionStandalone;

  public static final String SERIALIZED_NAME_RELEASE_SDK_URL = "releaseSdkUrl";
  @SerializedName(SERIALIZED_NAME_RELEASE_SDK_URL)
  private String releaseSdkUrl;

  public static final String SERIALIZED_NAME_RELEASE_SDK_VERSION = "releaseSdkVersion";
  @SerializedName(SERIALIZED_NAME_RELEASE_SDK_VERSION)
  private String releaseSdkVersion;

  public static final String SERIALIZED_NAME_RELEASE_SERVER_VERSION_STANDALONE = "releaseServerVersionStandalone";
  @SerializedName(SERIALIZED_NAME_RELEASE_SERVER_VERSION_STANDALONE)
  private String releaseServerVersionStandalone;

  public static final String SERIALIZED_NAME_SDK_DEVELOPER_FAQ_URL = "sdkDeveloperFaqUrl";
  @SerializedName(SERIALIZED_NAME_SDK_DEVELOPER_FAQ_URL)
  private String sdkDeveloperFaqUrl;

  public static final String SERIALIZED_NAME_SDK_DISCORD_URL = "sdkDiscordUrl";
  @SerializedName(SERIALIZED_NAME_SDK_DISCORD_URL)
  private String sdkDiscordUrl;

  public static final String SERIALIZED_NAME_SDK_NOT_ALLOWED_TO_PUBLISH_MESSAGE = "sdkNotAllowedToPublishMessage";
  @SerializedName(SERIALIZED_NAME_SDK_NOT_ALLOWED_TO_PUBLISH_MESSAGE)
  private String sdkNotAllowedToPublishMessage;

  public static final String SERIALIZED_NAME_SDK_UNITY_VERSION = "sdkUnityVersion";
  @SerializedName(SERIALIZED_NAME_SDK_UNITY_VERSION)
  private String sdkUnityVersion;

  public static final String SERIALIZED_NAME_SERVER_NAME = "serverName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public static final String SERIALIZED_NAME_SUPPORT_EMAIL = "supportEmail";
  @SerializedName(SERIALIZED_NAME_SUPPORT_EMAIL)
  private String supportEmail;

  public static final String SERIALIZED_NAME_TIME_OUT_WORLD_ID = "timeOutWorldId";
  @SerializedName(SERIALIZED_NAME_TIME_OUT_WORLD_ID)
  private String timeOutWorldId;

  public static final String SERIALIZED_NAME_TUTORIAL_WORLD_ID = "tutorialWorldId";
  @SerializedName(SERIALIZED_NAME_TUTORIAL_WORLD_ID)
  private String tutorialWorldId;

  public static final String SERIALIZED_NAME_UPDATE_RATE_MS_MAXIMUM = "updateRateMsMaximum";
  @SerializedName(SERIALIZED_NAME_UPDATE_RATE_MS_MAXIMUM)
  private BigDecimal updateRateMsMaximum;

  public static final String SERIALIZED_NAME_UPDATE_RATE_MS_MINIMUM = "updateRateMsMinimum";
  @SerializedName(SERIALIZED_NAME_UPDATE_RATE_MS_MINIMUM)
  private BigDecimal updateRateMsMinimum;

  public static final String SERIALIZED_NAME_UPDATE_RATE_MS_NORMAL = "updateRateMsNormal";
  @SerializedName(SERIALIZED_NAME_UPDATE_RATE_MS_NORMAL)
  private BigDecimal updateRateMsNormal;

  public static final String SERIALIZED_NAME_UPDATE_RATE_MS_UDON_MANUAL = "updateRateMsUdonManual";
  @SerializedName(SERIALIZED_NAME_UPDATE_RATE_MS_UDON_MANUAL)
  private BigDecimal updateRateMsUdonManual;

  public static final String SERIALIZED_NAME_UPLOAD_ANALYSIS_PERCENT = "uploadAnalysisPercent";
  @SerializedName(SERIALIZED_NAME_UPLOAD_ANALYSIS_PERCENT)
  private BigDecimal uploadAnalysisPercent;

  public static final String SERIALIZED_NAME_URL_LIST = "urlList";
  @SerializedName(SERIALIZED_NAME_URL_LIST)
  private List<String> urlList = new ArrayList<String>();

  public static final String SERIALIZED_NAME_USE_RELIABLE_UDP_FOR_VOICE = "useReliableUdpForVoice";
  @SerializedName(SERIALIZED_NAME_USE_RELIABLE_UDP_FOR_VOICE)
  private Boolean useReliableUdpForVoice = false;

  public static final String SERIALIZED_NAME_USER_UPDATE_PERIOD = "userUpdatePeriod";
  @SerializedName(SERIALIZED_NAME_USER_UPDATE_PERIOD)
  private BigDecimal userUpdatePeriod;

  public static final String SERIALIZED_NAME_USER_VERIFICATION_DELAY = "userVerificationDelay";
  @SerializedName(SERIALIZED_NAME_USER_VERIFICATION_DELAY)
  private BigDecimal userVerificationDelay;

  public static final String SERIALIZED_NAME_USER_VERIFICATION_RETRY = "userVerificationRetry";
  @SerializedName(SERIALIZED_NAME_USER_VERIFICATION_RETRY)
  private BigDecimal userVerificationRetry;

  public static final String SERIALIZED_NAME_USER_VERIFICATION_TIMEOUT = "userVerificationTimeout";
  @SerializedName(SERIALIZED_NAME_USER_VERIFICATION_TIMEOUT)
  private BigDecimal userVerificationTimeout;

  public static final String SERIALIZED_NAME_VIVE_WINDOWS_URL = "viveWindowsUrl";
  @SerializedName(SERIALIZED_NAME_VIVE_WINDOWS_URL)
  private String viveWindowsUrl;

  public static final String SERIALIZED_NAME_WHITE_LISTED_ASSET_URLS = "whiteListedAssetUrls";
  @SerializedName(SERIALIZED_NAME_WHITE_LISTED_ASSET_URLS)
  private List<String> whiteListedAssetUrls = new ArrayList<String>();

  public static final String SERIALIZED_NAME_WORLD_UPDATE_PERIOD = "worldUpdatePeriod";
  @SerializedName(SERIALIZED_NAME_WORLD_UPDATE_PERIOD)
  private BigDecimal worldUpdatePeriod;

  public static final String SERIALIZED_NAME_YOUTUBEDL_HASH = "youtubedl-hash";
  @SerializedName(SERIALIZED_NAME_YOUTUBEDL_HASH)
  private String youtubedlHash;

  public static final String SERIALIZED_NAME_YOUTUBEDL_VERSION = "youtubedl-version";
  @SerializedName(SERIALIZED_NAME_YOUTUBEDL_VERSION)
  private String youtubedlVersion;


   /**
   * VRChat&#39;s office address
   * @return address
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "VRChat's office address")

  public String getAddress() {
    return address;
  }




   /**
   * Public Announcements
   * @return announcements
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Public Announcements")

  public Set<ConfigAnnouncements> getAnnouncements() {
    return announcements;
  }




   /**
   * apiKey to be used for all other requests
   * @return apiKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "apiKey to be used for all other requests")

  public String getApiKey() {
    return apiKey;
  }




   /**
   * Game name
   * @return appName
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Game name")

  public String getAppName() {
    return appName;
  }




   /**
   * Build tag of the API server
   * @return buildVersionTag
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Build tag of the API server")

  public String getBuildVersionTag() {
    return buildVersionTag;
  }




   /**
   * apiKey to be used for all other requests
   * @return clientApiKey
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "apiKey to be used for all other requests")

  public String getClientApiKey() {
    return clientApiKey;
  }




  public Config clientBPSCeiling(BigDecimal clientBPSCeiling) {
    
    this.clientBPSCeiling = clientBPSCeiling;
    return this;
  }

   /**
   * Unknown
   * @return clientBPSCeiling
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unknown")

  public BigDecimal getClientBPSCeiling() {
    return clientBPSCeiling;
  }


  public void setClientBPSCeiling(BigDecimal clientBPSCeiling) {
    this.clientBPSCeiling = clientBPSCeiling;
  }


  public Config clientDisconnectTimeout(BigDecimal clientDisconnectTimeout) {
    
    this.clientDisconnectTimeout = clientDisconnectTimeout;
    return this;
  }

   /**
   * Unknown
   * @return clientDisconnectTimeout
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unknown")

  public BigDecimal getClientDisconnectTimeout() {
    return clientDisconnectTimeout;
  }


  public void setClientDisconnectTimeout(BigDecimal clientDisconnectTimeout) {
    this.clientDisconnectTimeout = clientDisconnectTimeout;
  }


  public Config clientReservedPlayerBPS(BigDecimal clientReservedPlayerBPS) {
    
    this.clientReservedPlayerBPS = clientReservedPlayerBPS;
    return this;
  }

   /**
   * Unknown
   * @return clientReservedPlayerBPS
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unknown")

  public BigDecimal getClientReservedPlayerBPS() {
    return clientReservedPlayerBPS;
  }


  public void setClientReservedPlayerBPS(BigDecimal clientReservedPlayerBPS) {
    this.clientReservedPlayerBPS = clientReservedPlayerBPS;
  }


  public Config clientSentCountAllowance(BigDecimal clientSentCountAllowance) {
    
    this.clientSentCountAllowance = clientSentCountAllowance;
    return this;
  }

   /**
   * Unknown
   * @return clientSentCountAllowance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unknown")

  public BigDecimal getClientSentCountAllowance() {
    return clientSentCountAllowance;
  }


  public void setClientSentCountAllowance(BigDecimal clientSentCountAllowance) {
    this.clientSentCountAllowance = clientSentCountAllowance;
  }


   /**
   * VRChat&#39;s contact email
   * @return contactEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "VRChat's contact email")

  public String getContactEmail() {
    return contactEmail;
  }




   /**
   * VRChat&#39;s copyright-issues-related email
   * @return copyrightEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "VRChat's copyright-issues-related email")

  public String getCopyrightEmail() {
    return copyrightEmail;
  }




   /**
   * Current version number of the Terms of Service
   * @return currentTOSVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Current version number of the Terms of Service")

  public BigDecimal getCurrentTOSVersion() {
    return currentTOSVersion;
  }




  public Config defaultAvatar(String defaultAvatar) {
    
    this.defaultAvatar = defaultAvatar;
    return this;
  }

   /**
   * Get defaultAvatar
   * @return defaultAvatar
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "avtr_912d66a4-4714-43b8-8407-7de2cafbf55b", required = true, value = "")

  public String getDefaultAvatar() {
    return defaultAvatar;
  }


  public void setDefaultAvatar(String defaultAvatar) {
    this.defaultAvatar = defaultAvatar;
  }


  public Config deploymentGroup(DeploymentGroup deploymentGroup) {
    
    this.deploymentGroup = deploymentGroup;
    return this;
  }

   /**
   * Get deploymentGroup
   * @return deploymentGroup
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public DeploymentGroup getDeploymentGroup() {
    return deploymentGroup;
  }


  public void setDeploymentGroup(DeploymentGroup deploymentGroup) {
    this.deploymentGroup = deploymentGroup;
  }


   /**
   * Version number for game development build
   * @return devAppVersionStandalone
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Version number for game development build")

  public String getDevAppVersionStandalone() {
    return devAppVersionStandalone;
  }




   /**
   * Developer Download link
   * @return devDownloadLinkWindows
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Developer Download link")

  public String getDevDownloadLinkWindows() {
    return devDownloadLinkWindows;
  }




   /**
   * Link to download the development SDK, use downloadUrls instead
   * @return devSdkUrl
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Link to download the development SDK, use downloadUrls instead")

  public String getDevSdkUrl() {
    return devSdkUrl;
  }




   /**
   * Version of the development SDK
   * @return devSdkVersion
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Version of the development SDK")

  public String getDevSdkVersion() {
    return devSdkVersion;
  }




   /**
   * Version number for server development build
   * @return devServerVersionStandalone
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Version number for server development build")

  public String getDevServerVersionStandalone() {
    return devServerVersionStandalone;
  }




  public Config disableAvatarCopying(Boolean disableAvatarCopying) {
    
    this.disableAvatarCopying = disableAvatarCopying;
    return this;
  }

   /**
   * Toggles if copying avatars should be disabled
   * @return disableAvatarCopying
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Toggles if copying avatars should be disabled")

  public Boolean getDisableAvatarCopying() {
    return disableAvatarCopying;
  }


  public void setDisableAvatarCopying(Boolean disableAvatarCopying) {
    this.disableAvatarCopying = disableAvatarCopying;
  }


  public Config disableAvatarGating(Boolean disableAvatarGating) {
    
    this.disableAvatarGating = disableAvatarGating;
    return this;
  }

   /**
   * Toggles if avatar gating should be disabled. Avatar gating restricts uploading of avatars to people with the &#x60;system_avatar_access&#x60; Tag or &#x60;admin_avatar_access&#x60; Tag
   * @return disableAvatarGating
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Toggles if avatar gating should be disabled. Avatar gating restricts uploading of avatars to people with the `system_avatar_access` Tag or `admin_avatar_access` Tag")

  public Boolean getDisableAvatarGating() {
    return disableAvatarGating;
  }


  public void setDisableAvatarGating(Boolean disableAvatarGating) {
    this.disableAvatarGating = disableAvatarGating;
  }


  public Config disableCommunityLabs(Boolean disableCommunityLabs) {
    
    this.disableCommunityLabs = disableCommunityLabs;
    return this;
  }

   /**
   * Toggles if the Community Labs should be disabled
   * @return disableCommunityLabs
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Toggles if the Community Labs should be disabled")

  public Boolean getDisableCommunityLabs() {
    return disableCommunityLabs;
  }


  public void setDisableCommunityLabs(Boolean disableCommunityLabs) {
    this.disableCommunityLabs = disableCommunityLabs;
  }


  public Config disableCommunityLabsPromotion(Boolean disableCommunityLabsPromotion) {
    
    this.disableCommunityLabsPromotion = disableCommunityLabsPromotion;
    return this;
  }

   /**
   * Toggles if promotion out of Community Labs should be disabled
   * @return disableCommunityLabsPromotion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Toggles if promotion out of Community Labs should be disabled")

  public Boolean getDisableCommunityLabsPromotion() {
    return disableCommunityLabsPromotion;
  }


  public void setDisableCommunityLabsPromotion(Boolean disableCommunityLabsPromotion) {
    this.disableCommunityLabsPromotion = disableCommunityLabsPromotion;
  }


  public Config disableEmail(Boolean disableEmail) {
    
    this.disableEmail = disableEmail;
    return this;
  }

   /**
   * Unknown
   * @return disableEmail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unknown")

  public Boolean getDisableEmail() {
    return disableEmail;
  }


  public void setDisableEmail(Boolean disableEmail) {
    this.disableEmail = disableEmail;
  }


  public Config disableEventStream(Boolean disableEventStream) {
    
    this.disableEventStream = disableEventStream;
    return this;
  }

   /**
   * Toggles if Analytics should be disabled (this sreportedly not used in the Client)
   * @return disableEventStream
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Toggles if Analytics should be disabled (this sreportedly not used in the Client)")

  public Boolean getDisableEventStream() {
    return disableEventStream;
  }


  public void setDisableEventStream(Boolean disableEventStream) {
    this.disableEventStream = disableEventStream;
  }


  public Config disableFeedbackGating(Boolean disableFeedbackGating) {
    
    this.disableFeedbackGating = disableFeedbackGating;
    return this;
  }

   /**
   * Toggles if feedback gating should be disabled. Feedback gating restricts submission of feedback (reporting a World or User) to people with the &#x60;system_feedback_access&#x60; Tag.
   * @return disableFeedbackGating
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Toggles if feedback gating should be disabled. Feedback gating restricts submission of feedback (reporting a World or User) to people with the `system_feedback_access` Tag.")

  public Boolean getDisableFeedbackGating() {
    return disableFeedbackGating;
  }


  public void setDisableFeedbackGating(Boolean disableFeedbackGating) {
    this.disableFeedbackGating = disableFeedbackGating;
  }


  public Config disableHello(Boolean disableHello) {
    
    this.disableHello = disableHello;
    return this;
  }

   /**
   * Unknown
   * @return disableHello
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unknown")

  public Boolean getDisableHello() {
    return disableHello;
  }


  public void setDisableHello(Boolean disableHello) {
    this.disableHello = disableHello;
  }


  public Config disableRegistration(Boolean disableRegistration) {
    
    this.disableRegistration = disableRegistration;
    return this;
  }

   /**
   * Toggles if new user account registration should be disabled
   * @return disableRegistration
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Toggles if new user account registration should be disabled")

  public Boolean getDisableRegistration() {
    return disableRegistration;
  }


  public void setDisableRegistration(Boolean disableRegistration) {
    this.disableRegistration = disableRegistration;
  }


  public Config disableSteamNetworking(Boolean disableSteamNetworking) {
    
    this.disableSteamNetworking = disableSteamNetworking;
    return this;
  }

   /**
   * Toggles if Steam Networking should be disabled. VRChat these days uses Photon Unity Networking (PUN) instead.
   * @return disableSteamNetworking
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Toggles if Steam Networking should be disabled. VRChat these days uses Photon Unity Networking (PUN) instead.")

  public Boolean getDisableSteamNetworking() {
    return disableSteamNetworking;
  }


  public void setDisableSteamNetworking(Boolean disableSteamNetworking) {
    this.disableSteamNetworking = disableSteamNetworking;
  }


  public Config disableTwoFactorAuth(Boolean disableTwoFactorAuth) {
    
    this.disableTwoFactorAuth = disableTwoFactorAuth;
    return this;
  }

   /**
   * Toggles if 2FA should be disabled.
   * @return disableTwoFactorAuth
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Toggles if 2FA should be disabled.")

  public Boolean getDisableTwoFactorAuth() {
    return disableTwoFactorAuth;
  }


  public void setDisableTwoFactorAuth(Boolean disableTwoFactorAuth) {
    this.disableTwoFactorAuth = disableTwoFactorAuth;
  }


  public Config disableUdon(Boolean disableUdon) {
    
    this.disableUdon = disableUdon;
    return this;
  }

   /**
   * Toggles if Udon should be universally disabled in-game.
   * @return disableUdon
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Toggles if Udon should be universally disabled in-game.")

  public Boolean getDisableUdon() {
    return disableUdon;
  }


  public void setDisableUdon(Boolean disableUdon) {
    this.disableUdon = disableUdon;
  }


  public Config disableUpgradeAccount(Boolean disableUpgradeAccount) {
    
    this.disableUpgradeAccount = disableUpgradeAccount;
    return this;
  }

   /**
   * Toggles if account upgrading \&quot;linking with Steam/Oculus\&quot; should be disabled.
   * @return disableUpgradeAccount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Toggles if account upgrading \"linking with Steam/Oculus\" should be disabled.")

  public Boolean getDisableUpgradeAccount() {
    return disableUpgradeAccount;
  }


  public void setDisableUpgradeAccount(Boolean disableUpgradeAccount) {
    this.disableUpgradeAccount = disableUpgradeAccount;
  }


   /**
   * Download link for game on the Oculus Rift website.
   * @return downloadLinkWindows
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Download link for game on the Oculus Rift website.")

  public String getDownloadLinkWindows() {
    return downloadLinkWindows;
  }




  public Config downloadUrls(ConfigDownloadUrls downloadUrls) {
    
    this.downloadUrls = downloadUrls;
    return this;
  }

   /**
   * Get downloadUrls
   * @return downloadUrls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ConfigDownloadUrls getDownloadUrls() {
    return downloadUrls;
  }


  public void setDownloadUrls(ConfigDownloadUrls downloadUrls) {
    this.downloadUrls = downloadUrls;
  }


   /**
   * Array of DynamicWorldRow objects, used by the game to display the list of world rows
   * @return dynamicWorldRows
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Array of DynamicWorldRow objects, used by the game to display the list of world rows")

  public Set<ConfigDynamicWorldRows> getDynamicWorldRows() {
    return dynamicWorldRows;
  }




  public Config events(ConfigEvents events) {
    
    this.events = events;
    return this;
  }

   /**
   * Get events
   * @return events
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ConfigEvents getEvents() {
    return events;
  }


  public void setEvents(ConfigEvents events) {
    this.events = events;
  }


   /**
   * Unknown
   * @return gearDemoRoomId
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public String getGearDemoRoomId() {
    return gearDemoRoomId;
  }




   /**
   * Redirect target if you try to open the base API domain in your browser
   * @return homepageRedirectTarget
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Redirect target if you try to open the base API domain in your browser")

  public String getHomepageRedirectTarget() {
    return homepageRedirectTarget;
  }




  public Config homeWorldId(String homeWorldId) {
    
    this.homeWorldId = homeWorldId;
    return this;
  }

   /**
   * Get homeWorldId
   * @return homeWorldId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "")

  public String getHomeWorldId() {
    return homeWorldId;
  }


  public void setHomeWorldId(String homeWorldId) {
    this.homeWorldId = homeWorldId;
  }


  public Config hubWorldId(String hubWorldId) {
    
    this.hubWorldId = hubWorldId;
    return this;
  }

   /**
   * Get hubWorldId
   * @return hubWorldId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "")

  public String getHubWorldId() {
    return hubWorldId;
  }


  public void setHubWorldId(String hubWorldId) {
    this.hubWorldId = hubWorldId;
  }


   /**
   * VRChat&#39;s job application email
   * @return jobsEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "VRChat's job application email")

  public String getJobsEmail() {
    return jobsEmail;
  }




   /**
   * MOTD
   * @return messageOfTheDay
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "MOTD")

  public String getMessageOfTheDay() {
    return messageOfTheDay;
  }




   /**
   * VRChat&#39;s moderation related email
   * @return moderationEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "VRChat's moderation related email")

  public String getModerationEmail() {
    return moderationEmail;
  }




  public Config moderationQueryPeriod(BigDecimal moderationQueryPeriod) {
    
    this.moderationQueryPeriod = moderationQueryPeriod;
    return this;
  }

   /**
   * Unknown
   * @return moderationQueryPeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getModerationQueryPeriod() {
    return moderationQueryPeriod;
  }


  public void setModerationQueryPeriod(BigDecimal moderationQueryPeriod) {
    this.moderationQueryPeriod = moderationQueryPeriod;
  }


   /**
   * Used in-game to notify a user they aren&#39;t allowed to select avatars in private worlds
   * @return notAllowedToSelectAvatarInPrivateWorldMessage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Used in-game to notify a user they aren't allowed to select avatars in private worlds")

  public String getNotAllowedToSelectAvatarInPrivateWorldMessage() {
    return notAllowedToSelectAvatarInPrivateWorldMessage;
  }




   /**
   * Extra [plugin](https://doc.photonengine.com/en-us/server/current/plugins/manual) to run in each instance
   * @return plugin
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Extra [plugin](https://doc.photonengine.com/en-us/server/current/plugins/manual) to run in each instance")

  public String getPlugin() {
    return plugin;
  }




   /**
   * Version number for game release build
   * @return releaseAppVersionStandalone
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Version number for game release build")

  public String getReleaseAppVersionStandalone() {
    return releaseAppVersionStandalone;
  }




   /**
   * Link to download the release SDK
   * @return releaseSdkUrl
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Link to download the release SDK")

  public String getReleaseSdkUrl() {
    return releaseSdkUrl;
  }




   /**
   * Version of the release SDK
   * @return releaseSdkVersion
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Version of the release SDK")

  public String getReleaseSdkVersion() {
    return releaseSdkVersion;
  }




   /**
   * Version number for server release build
   * @return releaseServerVersionStandalone
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Version number for server release build")

  public String getReleaseServerVersionStandalone() {
    return releaseServerVersionStandalone;
  }




   /**
   * Link to the developer FAQ
   * @return sdkDeveloperFaqUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Link to the developer FAQ")

  public String getSdkDeveloperFaqUrl() {
    return sdkDeveloperFaqUrl;
  }




   /**
   * Link to the official VRChat Discord
   * @return sdkDiscordUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Link to the official VRChat Discord")

  public String getSdkDiscordUrl() {
    return sdkDiscordUrl;
  }




   /**
   * Used in the SDK to notify a user they aren&#39;t allowed to upload avatars/worlds yet
   * @return sdkNotAllowedToPublishMessage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Used in the SDK to notify a user they aren't allowed to upload avatars/worlds yet")

  public String getSdkNotAllowedToPublishMessage() {
    return sdkNotAllowedToPublishMessage;
  }




   /**
   * Unity version supported by the SDK
   * @return sdkUnityVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unity version supported by the SDK")

  public String getSdkUnityVersion() {
    return sdkUnityVersion;
  }




   /**
   * Server name of the API server currently responding
   * @return serverName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Server name of the API server currently responding")

  public String getServerName() {
    return serverName;
  }




   /**
   * VRChat&#39;s support email
   * @return supportEmail
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "VRChat's support email")

  public String getSupportEmail() {
    return supportEmail;
  }




  public Config timeOutWorldId(String timeOutWorldId) {
    
    this.timeOutWorldId = timeOutWorldId;
    return this;
  }

   /**
   * Get timeOutWorldId
   * @return timeOutWorldId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "")

  public String getTimeOutWorldId() {
    return timeOutWorldId;
  }


  public void setTimeOutWorldId(String timeOutWorldId) {
    this.timeOutWorldId = timeOutWorldId;
  }


  public Config tutorialWorldId(String tutorialWorldId) {
    
    this.tutorialWorldId = tutorialWorldId;
    return this;
  }

   /**
   * Get tutorialWorldId
   * @return tutorialWorldId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "wrld_ba913a96-fac4-4048-a062-9aa5db092812", required = true, value = "")

  public String getTutorialWorldId() {
    return tutorialWorldId;
  }


  public void setTutorialWorldId(String tutorialWorldId) {
    this.tutorialWorldId = tutorialWorldId;
  }


   /**
   * Unknown
   * @return updateRateMsMaximum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getUpdateRateMsMaximum() {
    return updateRateMsMaximum;
  }




   /**
   * Unknown
   * @return updateRateMsMinimum
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getUpdateRateMsMinimum() {
    return updateRateMsMinimum;
  }




   /**
   * Unknown
   * @return updateRateMsNormal
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getUpdateRateMsNormal() {
    return updateRateMsNormal;
  }




   /**
   * Unknown
   * @return updateRateMsUdonManual
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getUpdateRateMsUdonManual() {
    return updateRateMsUdonManual;
  }




   /**
   * Unknown
   * @return uploadAnalysisPercent
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getUploadAnalysisPercent() {
    return uploadAnalysisPercent;
  }




   /**
   * List of allowed URLs that bypass the \&quot;Allow untrusted URL&#39;s\&quot; setting in-game
   * @return urlList
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of allowed URLs that bypass the \"Allow untrusted URL's\" setting in-game")

  public List<String> getUrlList() {
    return urlList;
  }




  public Config useReliableUdpForVoice(Boolean useReliableUdpForVoice) {
    
    this.useReliableUdpForVoice = useReliableUdpForVoice;
    return this;
  }

   /**
   * Unknown
   * @return useReliableUdpForVoice
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public Boolean getUseReliableUdpForVoice() {
    return useReliableUdpForVoice;
  }


  public void setUseReliableUdpForVoice(Boolean useReliableUdpForVoice) {
    this.useReliableUdpForVoice = useReliableUdpForVoice;
  }


   /**
   * Unknown
   * @return userUpdatePeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getUserUpdatePeriod() {
    return userUpdatePeriod;
  }




   /**
   * Unknown
   * @return userVerificationDelay
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getUserVerificationDelay() {
    return userVerificationDelay;
  }




   /**
   * Unknown
   * @return userVerificationRetry
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getUserVerificationRetry() {
    return userVerificationRetry;
  }




   /**
   * Unknown
   * @return userVerificationTimeout
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getUserVerificationTimeout() {
    return userVerificationTimeout;
  }




   /**
   * Download link for game on the Steam website.
   * @return viveWindowsUrl
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Download link for game on the Steam website.")

  public String getViveWindowsUrl() {
    return viveWindowsUrl;
  }




   /**
   * List of allowed URLs that are allowed to host avatar assets
   * @return whiteListedAssetUrls
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "List of allowed URLs that are allowed to host avatar assets")

  public List<String> getWhiteListedAssetUrls() {
    return whiteListedAssetUrls;
  }




   /**
   * Unknown
   * @return worldUpdatePeriod
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Unknown")

  public BigDecimal getWorldUpdatePeriod() {
    return worldUpdatePeriod;
  }




   /**
   * Currently used youtube-dl.exe hash in SHA-256-delimited format
   * @return youtubedlHash
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Currently used youtube-dl.exe hash in SHA-256-delimited format")

  public String getYoutubedlHash() {
    return youtubedlHash;
  }




   /**
   * Currently used youtube-dl.exe version
   * @return youtubedlVersion
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Currently used youtube-dl.exe version")

  public String getYoutubedlVersion() {
    return youtubedlVersion;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Config config = (Config) o;
    return Objects.equals(this.address, config.address) &&
        Objects.equals(this.announcements, config.announcements) &&
        Objects.equals(this.apiKey, config.apiKey) &&
        Objects.equals(this.appName, config.appName) &&
        Objects.equals(this.buildVersionTag, config.buildVersionTag) &&
        Objects.equals(this.clientApiKey, config.clientApiKey) &&
        Objects.equals(this.clientBPSCeiling, config.clientBPSCeiling) &&
        Objects.equals(this.clientDisconnectTimeout, config.clientDisconnectTimeout) &&
        Objects.equals(this.clientReservedPlayerBPS, config.clientReservedPlayerBPS) &&
        Objects.equals(this.clientSentCountAllowance, config.clientSentCountAllowance) &&
        Objects.equals(this.contactEmail, config.contactEmail) &&
        Objects.equals(this.copyrightEmail, config.copyrightEmail) &&
        Objects.equals(this.currentTOSVersion, config.currentTOSVersion) &&
        Objects.equals(this.defaultAvatar, config.defaultAvatar) &&
        Objects.equals(this.deploymentGroup, config.deploymentGroup) &&
        Objects.equals(this.devAppVersionStandalone, config.devAppVersionStandalone) &&
        Objects.equals(this.devDownloadLinkWindows, config.devDownloadLinkWindows) &&
        Objects.equals(this.devSdkUrl, config.devSdkUrl) &&
        Objects.equals(this.devSdkVersion, config.devSdkVersion) &&
        Objects.equals(this.devServerVersionStandalone, config.devServerVersionStandalone) &&
        Objects.equals(this.disableAvatarCopying, config.disableAvatarCopying) &&
        Objects.equals(this.disableAvatarGating, config.disableAvatarGating) &&
        Objects.equals(this.disableCommunityLabs, config.disableCommunityLabs) &&
        Objects.equals(this.disableCommunityLabsPromotion, config.disableCommunityLabsPromotion) &&
        Objects.equals(this.disableEmail, config.disableEmail) &&
        Objects.equals(this.disableEventStream, config.disableEventStream) &&
        Objects.equals(this.disableFeedbackGating, config.disableFeedbackGating) &&
        Objects.equals(this.disableHello, config.disableHello) &&
        Objects.equals(this.disableRegistration, config.disableRegistration) &&
        Objects.equals(this.disableSteamNetworking, config.disableSteamNetworking) &&
        Objects.equals(this.disableTwoFactorAuth, config.disableTwoFactorAuth) &&
        Objects.equals(this.disableUdon, config.disableUdon) &&
        Objects.equals(this.disableUpgradeAccount, config.disableUpgradeAccount) &&
        Objects.equals(this.downloadLinkWindows, config.downloadLinkWindows) &&
        Objects.equals(this.downloadUrls, config.downloadUrls) &&
        Objects.equals(this.dynamicWorldRows, config.dynamicWorldRows) &&
        Objects.equals(this.events, config.events) &&
        Objects.equals(this.gearDemoRoomId, config.gearDemoRoomId) &&
        Objects.equals(this.homepageRedirectTarget, config.homepageRedirectTarget) &&
        Objects.equals(this.homeWorldId, config.homeWorldId) &&
        Objects.equals(this.hubWorldId, config.hubWorldId) &&
        Objects.equals(this.jobsEmail, config.jobsEmail) &&
        Objects.equals(this.messageOfTheDay, config.messageOfTheDay) &&
        Objects.equals(this.moderationEmail, config.moderationEmail) &&
        Objects.equals(this.moderationQueryPeriod, config.moderationQueryPeriod) &&
        Objects.equals(this.notAllowedToSelectAvatarInPrivateWorldMessage, config.notAllowedToSelectAvatarInPrivateWorldMessage) &&
        Objects.equals(this.plugin, config.plugin) &&
        Objects.equals(this.releaseAppVersionStandalone, config.releaseAppVersionStandalone) &&
        Objects.equals(this.releaseSdkUrl, config.releaseSdkUrl) &&
        Objects.equals(this.releaseSdkVersion, config.releaseSdkVersion) &&
        Objects.equals(this.releaseServerVersionStandalone, config.releaseServerVersionStandalone) &&
        Objects.equals(this.sdkDeveloperFaqUrl, config.sdkDeveloperFaqUrl) &&
        Objects.equals(this.sdkDiscordUrl, config.sdkDiscordUrl) &&
        Objects.equals(this.sdkNotAllowedToPublishMessage, config.sdkNotAllowedToPublishMessage) &&
        Objects.equals(this.sdkUnityVersion, config.sdkUnityVersion) &&
        Objects.equals(this.serverName, config.serverName) &&
        Objects.equals(this.supportEmail, config.supportEmail) &&
        Objects.equals(this.timeOutWorldId, config.timeOutWorldId) &&
        Objects.equals(this.tutorialWorldId, config.tutorialWorldId) &&
        Objects.equals(this.updateRateMsMaximum, config.updateRateMsMaximum) &&
        Objects.equals(this.updateRateMsMinimum, config.updateRateMsMinimum) &&
        Objects.equals(this.updateRateMsNormal, config.updateRateMsNormal) &&
        Objects.equals(this.updateRateMsUdonManual, config.updateRateMsUdonManual) &&
        Objects.equals(this.uploadAnalysisPercent, config.uploadAnalysisPercent) &&
        Objects.equals(this.urlList, config.urlList) &&
        Objects.equals(this.useReliableUdpForVoice, config.useReliableUdpForVoice) &&
        Objects.equals(this.userUpdatePeriod, config.userUpdatePeriod) &&
        Objects.equals(this.userVerificationDelay, config.userVerificationDelay) &&
        Objects.equals(this.userVerificationRetry, config.userVerificationRetry) &&
        Objects.equals(this.userVerificationTimeout, config.userVerificationTimeout) &&
        Objects.equals(this.viveWindowsUrl, config.viveWindowsUrl) &&
        Objects.equals(this.whiteListedAssetUrls, config.whiteListedAssetUrls) &&
        Objects.equals(this.worldUpdatePeriod, config.worldUpdatePeriod) &&
        Objects.equals(this.youtubedlHash, config.youtubedlHash) &&
        Objects.equals(this.youtubedlVersion, config.youtubedlVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, announcements, apiKey, appName, buildVersionTag, clientApiKey, clientBPSCeiling, clientDisconnectTimeout, clientReservedPlayerBPS, clientSentCountAllowance, contactEmail, copyrightEmail, currentTOSVersion, defaultAvatar, deploymentGroup, devAppVersionStandalone, devDownloadLinkWindows, devSdkUrl, devSdkVersion, devServerVersionStandalone, disableAvatarCopying, disableAvatarGating, disableCommunityLabs, disableCommunityLabsPromotion, disableEmail, disableEventStream, disableFeedbackGating, disableHello, disableRegistration, disableSteamNetworking, disableTwoFactorAuth, disableUdon, disableUpgradeAccount, downloadLinkWindows, downloadUrls, dynamicWorldRows, events, gearDemoRoomId, homepageRedirectTarget, homeWorldId, hubWorldId, jobsEmail, messageOfTheDay, moderationEmail, moderationQueryPeriod, notAllowedToSelectAvatarInPrivateWorldMessage, plugin, releaseAppVersionStandalone, releaseSdkUrl, releaseSdkVersion, releaseServerVersionStandalone, sdkDeveloperFaqUrl, sdkDiscordUrl, sdkNotAllowedToPublishMessage, sdkUnityVersion, serverName, supportEmail, timeOutWorldId, tutorialWorldId, updateRateMsMaximum, updateRateMsMinimum, updateRateMsNormal, updateRateMsUdonManual, uploadAnalysisPercent, urlList, useReliableUdpForVoice, userUpdatePeriod, userVerificationDelay, userVerificationRetry, userVerificationTimeout, viveWindowsUrl, whiteListedAssetUrls, worldUpdatePeriod, youtubedlHash, youtubedlVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Config {\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    announcements: ").append(toIndentedString(announcements)).append("\n");
    sb.append("    apiKey: ").append(toIndentedString(apiKey)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    buildVersionTag: ").append(toIndentedString(buildVersionTag)).append("\n");
    sb.append("    clientApiKey: ").append(toIndentedString(clientApiKey)).append("\n");
    sb.append("    clientBPSCeiling: ").append(toIndentedString(clientBPSCeiling)).append("\n");
    sb.append("    clientDisconnectTimeout: ").append(toIndentedString(clientDisconnectTimeout)).append("\n");
    sb.append("    clientReservedPlayerBPS: ").append(toIndentedString(clientReservedPlayerBPS)).append("\n");
    sb.append("    clientSentCountAllowance: ").append(toIndentedString(clientSentCountAllowance)).append("\n");
    sb.append("    contactEmail: ").append(toIndentedString(contactEmail)).append("\n");
    sb.append("    copyrightEmail: ").append(toIndentedString(copyrightEmail)).append("\n");
    sb.append("    currentTOSVersion: ").append(toIndentedString(currentTOSVersion)).append("\n");
    sb.append("    defaultAvatar: ").append(toIndentedString(defaultAvatar)).append("\n");
    sb.append("    deploymentGroup: ").append(toIndentedString(deploymentGroup)).append("\n");
    sb.append("    devAppVersionStandalone: ").append(toIndentedString(devAppVersionStandalone)).append("\n");
    sb.append("    devDownloadLinkWindows: ").append(toIndentedString(devDownloadLinkWindows)).append("\n");
    sb.append("    devSdkUrl: ").append(toIndentedString(devSdkUrl)).append("\n");
    sb.append("    devSdkVersion: ").append(toIndentedString(devSdkVersion)).append("\n");
    sb.append("    devServerVersionStandalone: ").append(toIndentedString(devServerVersionStandalone)).append("\n");
    sb.append("    disableAvatarCopying: ").append(toIndentedString(disableAvatarCopying)).append("\n");
    sb.append("    disableAvatarGating: ").append(toIndentedString(disableAvatarGating)).append("\n");
    sb.append("    disableCommunityLabs: ").append(toIndentedString(disableCommunityLabs)).append("\n");
    sb.append("    disableCommunityLabsPromotion: ").append(toIndentedString(disableCommunityLabsPromotion)).append("\n");
    sb.append("    disableEmail: ").append(toIndentedString(disableEmail)).append("\n");
    sb.append("    disableEventStream: ").append(toIndentedString(disableEventStream)).append("\n");
    sb.append("    disableFeedbackGating: ").append(toIndentedString(disableFeedbackGating)).append("\n");
    sb.append("    disableHello: ").append(toIndentedString(disableHello)).append("\n");
    sb.append("    disableRegistration: ").append(toIndentedString(disableRegistration)).append("\n");
    sb.append("    disableSteamNetworking: ").append(toIndentedString(disableSteamNetworking)).append("\n");
    sb.append("    disableTwoFactorAuth: ").append(toIndentedString(disableTwoFactorAuth)).append("\n");
    sb.append("    disableUdon: ").append(toIndentedString(disableUdon)).append("\n");
    sb.append("    disableUpgradeAccount: ").append(toIndentedString(disableUpgradeAccount)).append("\n");
    sb.append("    downloadLinkWindows: ").append(toIndentedString(downloadLinkWindows)).append("\n");
    sb.append("    downloadUrls: ").append(toIndentedString(downloadUrls)).append("\n");
    sb.append("    dynamicWorldRows: ").append(toIndentedString(dynamicWorldRows)).append("\n");
    sb.append("    events: ").append(toIndentedString(events)).append("\n");
    sb.append("    gearDemoRoomId: ").append(toIndentedString(gearDemoRoomId)).append("\n");
    sb.append("    homepageRedirectTarget: ").append(toIndentedString(homepageRedirectTarget)).append("\n");
    sb.append("    homeWorldId: ").append(toIndentedString(homeWorldId)).append("\n");
    sb.append("    hubWorldId: ").append(toIndentedString(hubWorldId)).append("\n");
    sb.append("    jobsEmail: ").append(toIndentedString(jobsEmail)).append("\n");
    sb.append("    messageOfTheDay: ").append(toIndentedString(messageOfTheDay)).append("\n");
    sb.append("    moderationEmail: ").append(toIndentedString(moderationEmail)).append("\n");
    sb.append("    moderationQueryPeriod: ").append(toIndentedString(moderationQueryPeriod)).append("\n");
    sb.append("    notAllowedToSelectAvatarInPrivateWorldMessage: ").append(toIndentedString(notAllowedToSelectAvatarInPrivateWorldMessage)).append("\n");
    sb.append("    plugin: ").append(toIndentedString(plugin)).append("\n");
    sb.append("    releaseAppVersionStandalone: ").append(toIndentedString(releaseAppVersionStandalone)).append("\n");
    sb.append("    releaseSdkUrl: ").append(toIndentedString(releaseSdkUrl)).append("\n");
    sb.append("    releaseSdkVersion: ").append(toIndentedString(releaseSdkVersion)).append("\n");
    sb.append("    releaseServerVersionStandalone: ").append(toIndentedString(releaseServerVersionStandalone)).append("\n");
    sb.append("    sdkDeveloperFaqUrl: ").append(toIndentedString(sdkDeveloperFaqUrl)).append("\n");
    sb.append("    sdkDiscordUrl: ").append(toIndentedString(sdkDiscordUrl)).append("\n");
    sb.append("    sdkNotAllowedToPublishMessage: ").append(toIndentedString(sdkNotAllowedToPublishMessage)).append("\n");
    sb.append("    sdkUnityVersion: ").append(toIndentedString(sdkUnityVersion)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    supportEmail: ").append(toIndentedString(supportEmail)).append("\n");
    sb.append("    timeOutWorldId: ").append(toIndentedString(timeOutWorldId)).append("\n");
    sb.append("    tutorialWorldId: ").append(toIndentedString(tutorialWorldId)).append("\n");
    sb.append("    updateRateMsMaximum: ").append(toIndentedString(updateRateMsMaximum)).append("\n");
    sb.append("    updateRateMsMinimum: ").append(toIndentedString(updateRateMsMinimum)).append("\n");
    sb.append("    updateRateMsNormal: ").append(toIndentedString(updateRateMsNormal)).append("\n");
    sb.append("    updateRateMsUdonManual: ").append(toIndentedString(updateRateMsUdonManual)).append("\n");
    sb.append("    uploadAnalysisPercent: ").append(toIndentedString(uploadAnalysisPercent)).append("\n");
    sb.append("    urlList: ").append(toIndentedString(urlList)).append("\n");
    sb.append("    useReliableUdpForVoice: ").append(toIndentedString(useReliableUdpForVoice)).append("\n");
    sb.append("    userUpdatePeriod: ").append(toIndentedString(userUpdatePeriod)).append("\n");
    sb.append("    userVerificationDelay: ").append(toIndentedString(userVerificationDelay)).append("\n");
    sb.append("    userVerificationRetry: ").append(toIndentedString(userVerificationRetry)).append("\n");
    sb.append("    userVerificationTimeout: ").append(toIndentedString(userVerificationTimeout)).append("\n");
    sb.append("    viveWindowsUrl: ").append(toIndentedString(viveWindowsUrl)).append("\n");
    sb.append("    whiteListedAssetUrls: ").append(toIndentedString(whiteListedAssetUrls)).append("\n");
    sb.append("    worldUpdatePeriod: ").append(toIndentedString(worldUpdatePeriod)).append("\n");
    sb.append("    youtubedlHash: ").append(toIndentedString(youtubedlHash)).append("\n");
    sb.append("    youtubedlVersion: ").append(toIndentedString(youtubedlVersion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

