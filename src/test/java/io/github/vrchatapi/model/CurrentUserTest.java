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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.vrchatapi.model.DeveloperType;
import io.github.vrchatapi.model.Platform;
import io.github.vrchatapi.model.UserState;
import io.github.vrchatapi.model.UserStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.threeten.bp.LocalDate;
import org.threeten.bp.OffsetDateTime;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for CurrentUser
 */
public class CurrentUserTest {
    private final CurrentUser model = new CurrentUser();

    /**
     * Model tests for CurrentUser
     */
    @Test
    public void testCurrentUser() {
        // TODO: test CurrentUser
    }

    /**
     * Test the property 'id'
     */
    @Test
    public void idTest() {
        // TODO: test id
    }

    /**
     * Test the property 'username'
     */
    @Test
    public void usernameTest() {
        // TODO: test username
    }

    /**
     * Test the property 'displayName'
     */
    @Test
    public void displayNameTest() {
        // TODO: test displayName
    }

    /**
     * Test the property 'userIcon'
     */
    @Test
    public void userIconTest() {
        // TODO: test userIcon
    }

    /**
     * Test the property 'bio'
     */
    @Test
    public void bioTest() {
        // TODO: test bio
    }

    /**
     * Test the property 'bioLinks'
     */
    @Test
    public void bioLinksTest() {
        // TODO: test bioLinks
    }

    /**
     * Test the property 'profilePicOverride'
     */
    @Test
    public void profilePicOverrideTest() {
        // TODO: test profilePicOverride
    }

    /**
     * Test the property 'statusDescription'
     */
    @Test
    public void statusDescriptionTest() {
        // TODO: test statusDescription
    }

    /**
     * Test the property 'pastDisplayNames'
     */
    @Test
    public void pastDisplayNamesTest() {
        // TODO: test pastDisplayNames
    }

    /**
     * Test the property 'hasEmail'
     */
    @Test
    public void hasEmailTest() {
        // TODO: test hasEmail
    }

    /**
     * Test the property 'hasPendingEmail'
     */
    @Test
    public void hasPendingEmailTest() {
        // TODO: test hasPendingEmail
    }

    /**
     * Test the property 'obfuscatedEmail'
     */
    @Test
    public void obfuscatedEmailTest() {
        // TODO: test obfuscatedEmail
    }

    /**
     * Test the property 'obfuscatedPendingEmail'
     */
    @Test
    public void obfuscatedPendingEmailTest() {
        // TODO: test obfuscatedPendingEmail
    }

    /**
     * Test the property 'emailVerified'
     */
    @Test
    public void emailVerifiedTest() {
        // TODO: test emailVerified
    }

    /**
     * Test the property 'hasBirthday'
     */
    @Test
    public void hasBirthdayTest() {
        // TODO: test hasBirthday
    }

    /**
     * Test the property 'unsubscribe'
     */
    @Test
    public void unsubscribeTest() {
        // TODO: test unsubscribe
    }

    /**
     * Test the property 'statusHistory'
     */
    @Test
    public void statusHistoryTest() {
        // TODO: test statusHistory
    }

    /**
     * Test the property 'statusFirstTime'
     */
    @Test
    public void statusFirstTimeTest() {
        // TODO: test statusFirstTime
    }

    /**
     * Test the property 'friends'
     */
    @Test
    public void friendsTest() {
        // TODO: test friends
    }

    /**
     * Test the property 'friendGroupNames'
     */
    @Test
    public void friendGroupNamesTest() {
        // TODO: test friendGroupNames
    }

    /**
     * Test the property 'currentAvatarImageUrl'
     */
    @Test
    public void currentAvatarImageUrlTest() {
        // TODO: test currentAvatarImageUrl
    }

    /**
     * Test the property 'currentAvatarThumbnailImageUrl'
     */
    @Test
    public void currentAvatarThumbnailImageUrlTest() {
        // TODO: test currentAvatarThumbnailImageUrl
    }

    /**
     * Test the property 'fallbackAvatar'
     */
    @Test
    public void fallbackAvatarTest() {
        // TODO: test fallbackAvatar
    }

    /**
     * Test the property 'currentAvatar'
     */
    @Test
    public void currentAvatarTest() {
        // TODO: test currentAvatar
    }

    /**
     * Test the property 'currentAvatarAssetUrl'
     */
    @Test
    public void currentAvatarAssetUrlTest() {
        // TODO: test currentAvatarAssetUrl
    }

    /**
     * Test the property 'accountDeletionDate'
     */
    @Test
    public void accountDeletionDateTest() {
        // TODO: test accountDeletionDate
    }

    /**
     * Test the property 'acceptedTOSVersion'
     */
    @Test
    public void acceptedTOSVersionTest() {
        // TODO: test acceptedTOSVersion
    }

    /**
     * Test the property 'steamId'
     */
    @Test
    public void steamIdTest() {
        // TODO: test steamId
    }

    /**
     * Test the property 'steamDetails'
     */
    @Test
    public void steamDetailsTest() {
        // TODO: test steamDetails
    }

    /**
     * Test the property 'oculusId'
     */
    @Test
    public void oculusIdTest() {
        // TODO: test oculusId
    }

    /**
     * Test the property 'hasLoggedInFromClient'
     */
    @Test
    public void hasLoggedInFromClientTest() {
        // TODO: test hasLoggedInFromClient
    }

    /**
     * Test the property 'homeLocation'
     */
    @Test
    public void homeLocationTest() {
        // TODO: test homeLocation
    }

    /**
     * Test the property 'twoFactorAuthEnabled'
     */
    @Test
    public void twoFactorAuthEnabledTest() {
        // TODO: test twoFactorAuthEnabled
    }

    /**
     * Test the property 'state'
     */
    @Test
    public void stateTest() {
        // TODO: test state
    }

    /**
     * Test the property 'tags'
     */
    @Test
    public void tagsTest() {
        // TODO: test tags
    }

    /**
     * Test the property 'developerType'
     */
    @Test
    public void developerTypeTest() {
        // TODO: test developerType
    }

    /**
     * Test the property 'lastLogin'
     */
    @Test
    public void lastLoginTest() {
        // TODO: test lastLogin
    }

    /**
     * Test the property 'lastPlatform'
     */
    @Test
    public void lastPlatformTest() {
        // TODO: test lastPlatform
    }

    /**
     * Test the property 'allowAvatarCopying'
     */
    @Test
    public void allowAvatarCopyingTest() {
        // TODO: test allowAvatarCopying
    }

    /**
     * Test the property 'status'
     */
    @Test
    public void statusTest() {
        // TODO: test status
    }

    /**
     * Test the property 'dateJoined'
     */
    @Test
    public void dateJoinedTest() {
        // TODO: test dateJoined
    }

    /**
     * Test the property 'isFriend'
     */
    @Test
    public void isFriendTest() {
        // TODO: test isFriend
    }

    /**
     * Test the property 'friendKey'
     */
    @Test
    public void friendKeyTest() {
        // TODO: test friendKey
    }

    /**
     * Test the property 'onlineFriends'
     */
    @Test
    public void onlineFriendsTest() {
        // TODO: test onlineFriends
    }

    /**
     * Test the property 'activeFriends'
     */
    @Test
    public void activeFriendsTest() {
        // TODO: test activeFriends
    }

    /**
     * Test the property 'offlineFriends'
     */
    @Test
    public void offlineFriendsTest() {
        // TODO: test offlineFriends
    }

}
