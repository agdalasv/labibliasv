package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the {@code libs} extension.
 */
@NonNullApi
public class LibrariesForLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

    /**
     * Dependency provider for <b>androidxActivityCompose</b> with <b>androidx.activity:activity-compose</b> coordinates and
     * with version reference <b>activityCompose</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxActivityCompose() {
        return create("androidxActivityCompose");
    }

    /**
     * Dependency provider for <b>androidxAppcompat</b> with <b>androidx.appcompat:appcompat</b> coordinates and
     * with version reference <b>appcompat</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxAppcompat() {
        return create("androidxAppcompat");
    }

    /**
     * Dependency provider for <b>androidxComposeBom</b> with <b>androidx.compose:compose-bom</b> coordinates and
     * with version reference <b>composeBom</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxComposeBom() {
        return create("androidxComposeBom");
    }

    /**
     * Dependency provider for <b>androidxCoreKtx</b> with <b>androidx.core:core-ktx</b> coordinates and
     * with version reference <b>coreKtx</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxCoreKtx() {
        return create("androidxCoreKtx");
    }

    /**
     * Dependency provider for <b>androidxDatastorePreferences</b> with <b>androidx.datastore:datastore-preferences</b> coordinates and
     * with version reference <b>datastorePreferences</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxDatastorePreferences() {
        return create("androidxDatastorePreferences");
    }

    /**
     * Dependency provider for <b>androidxEspressoCore</b> with <b>androidx.test.espresso:espresso-core</b> coordinates and
     * with version reference <b>espressoCore</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxEspressoCore() {
        return create("androidxEspressoCore");
    }

    /**
     * Dependency provider for <b>androidxJunit</b> with <b>androidx.test.ext:junit</b> coordinates and
     * with version reference <b>junitVersion</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxJunit() {
        return create("androidxJunit");
    }

    /**
     * Dependency provider for <b>androidxLifecycleRuntimeCompose</b> with <b>androidx.lifecycle:lifecycle-runtime-compose</b> coordinates and
     * with version reference <b>lifecycleRuntime</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxLifecycleRuntimeCompose() {
        return create("androidxLifecycleRuntimeCompose");
    }

    /**
     * Dependency provider for <b>androidxLifecycleRuntimeKtx</b> with <b>androidx.lifecycle:lifecycle-runtime-ktx</b> coordinates and
     * with version reference <b>lifecycleRuntime</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxLifecycleRuntimeKtx() {
        return create("androidxLifecycleRuntimeKtx");
    }

    /**
     * Dependency provider for <b>androidxLifecycleViewmodelCompose</b> with <b>androidx.lifecycle:lifecycle-viewmodel-compose</b> coordinates and
     * with version reference <b>lifecycleRuntime</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxLifecycleViewmodelCompose() {
        return create("androidxLifecycleViewmodelCompose");
    }

    /**
     * Dependency provider for <b>androidxMaterial3</b> with <b>androidx.compose.material3:material3</b> coordinates and
     * with <b>no version specified</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxMaterial3() {
        return create("androidxMaterial3");
    }

    /**
     * Dependency provider for <b>androidxMaterialIconsExtended</b> with <b>androidx.compose.material:material-icons-extended</b> coordinates and
     * with <b>no version specified</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxMaterialIconsExtended() {
        return create("androidxMaterialIconsExtended");
    }

    /**
     * Dependency provider for <b>androidxNavigationCompose</b> with <b>androidx.navigation:navigation-compose</b> coordinates and
     * with version reference <b>navigation</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxNavigationCompose() {
        return create("androidxNavigationCompose");
    }

    /**
     * Dependency provider for <b>androidxUi</b> with <b>androidx.compose.ui:ui</b> coordinates and
     * with <b>no version specified</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxUi() {
        return create("androidxUi");
    }

    /**
     * Dependency provider for <b>androidxUiGraphics</b> with <b>androidx.compose.ui:ui-graphics</b> coordinates and
     * with <b>no version specified</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxUiGraphics() {
        return create("androidxUiGraphics");
    }

    /**
     * Dependency provider for <b>androidxUiTestManifest</b> with <b>androidx.compose.ui:ui-test-manifest</b> coordinates and
     * with <b>no version specified</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxUiTestManifest() {
        return create("androidxUiTestManifest");
    }

    /**
     * Dependency provider for <b>androidxUiTooling</b> with <b>androidx.compose.ui:ui-tooling</b> coordinates and
     * with <b>no version specified</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxUiTooling() {
        return create("androidxUiTooling");
    }

    /**
     * Dependency provider for <b>androidxUiToolingPreview</b> with <b>androidx.compose.ui:ui-tooling-preview</b> coordinates and
     * with <b>no version specified</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getAndroidxUiToolingPreview() {
        return create("androidxUiToolingPreview");
    }

    /**
     * Dependency provider for <b>comGoogleCodeGson</b> with <b>com.google.code.gson:gson</b> coordinates and
     * with version reference <b>gson</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getComGoogleCodeGson() {
        return create("comGoogleCodeGson");
    }

    /**
     * Dependency provider for <b>junit</b> with <b>junit:junit</b> coordinates and
     * with version reference <b>junit</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getJunit() {
        return create("junit");
    }

    /**
     * Dependency provider for <b>material</b> with <b>com.google.android.material:material</b> coordinates and
     * with version reference <b>material</b>
     * <p>
     * This dependency was declared in catalog libs.versions.toml
     */
    public Provider<MinimalExternalModuleDependency> getMaterial() {
        return create("material");
    }

    /**
     * Group of versions at <b>versions</b>
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Group of bundles at <b>bundles</b>
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Group of plugins at <b>plugins</b>
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class VersionAccessors extends VersionFactory  {

        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Version alias <b>activityCompose</b> with value <b>1.10.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getActivityCompose() { return getVersion("activityCompose"); }

        /**
         * Version alias <b>agp</b> with value <b>9.1.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAgp() { return getVersion("agp"); }

        /**
         * Version alias <b>appcompat</b> with value <b>1.7.1</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getAppcompat() { return getVersion("appcompat"); }

        /**
         * Version alias <b>composeBom</b> with value <b>2024.12.01</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getComposeBom() { return getVersion("composeBom"); }

        /**
         * Version alias <b>coreKtx</b> with value <b>1.18.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getCoreKtx() { return getVersion("coreKtx"); }

        /**
         * Version alias <b>datastorePreferences</b> with value <b>1.1.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getDatastorePreferences() { return getVersion("datastorePreferences"); }

        /**
         * Version alias <b>espressoCore</b> with value <b>3.7.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getEspressoCore() { return getVersion("espressoCore"); }

        /**
         * Version alias <b>gson</b> with value <b>2.11.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getGson() { return getVersion("gson"); }

        /**
         * Version alias <b>junit</b> with value <b>4.13.2</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJunit() { return getVersion("junit"); }

        /**
         * Version alias <b>junitVersion</b> with value <b>1.3.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getJunitVersion() { return getVersion("junitVersion"); }

        /**
         * Version alias <b>kotlin</b> with value <b>2.0.21</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getKotlin() { return getVersion("kotlin"); }

        /**
         * Version alias <b>lifecycleRuntime</b> with value <b>2.8.7</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getLifecycleRuntime() { return getVersion("lifecycleRuntime"); }

        /**
         * Version alias <b>material</b> with value <b>1.13.0</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getMaterial() { return getVersion("material"); }

        /**
         * Version alias <b>navigation</b> with value <b>2.8.5</b>
         * <p>
         * If the version is a rich version and cannot be represented as a
         * single version string, an empty string is returned.
         * <p>
         * This version was declared in catalog libs.versions.toml
         */
        public Provider<String> getNavigation() { return getVersion("navigation"); }

    }

    public static class BundleAccessors extends BundleFactory {

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Plugin provider for <b>androidApplication</b> with plugin id <b>com.android.application</b> and
         * with version reference <b>agp</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getAndroidApplication() { return createPlugin("androidApplication"); }

        /**
         * Plugin provider for <b>kotlinAndroid</b> with plugin id <b>org.jetbrains.kotlin.android</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getKotlinAndroid() { return createPlugin("kotlinAndroid"); }

        /**
         * Plugin provider for <b>kotlinCompose</b> with plugin id <b>org.jetbrains.kotlin.plugin.compose</b> and
         * with version reference <b>kotlin</b>
         * <p>
         * This plugin was declared in catalog libs.versions.toml
         */
        public Provider<PluginDependency> getKotlinCompose() { return createPlugin("kotlinCompose"); }

    }

}
