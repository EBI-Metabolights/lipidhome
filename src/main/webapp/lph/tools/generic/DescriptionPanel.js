Ext.define('lph.tools.generic.DescriptionPanel', {
	/* Begin Definitions */
    extend      : 'Ext.Panel',
   
	title		: 'Description',
    iconCls     : 'information-16',
	collapsible	: true,
	layout		: 'fit',

	url 		: null,
	
	constructor: function(config) {
    	this.callParent(arguments);
        this.initConfig(config);

        this._loadURL();

        return this;
    },

    _loadURL: function(){
        if(Ext.isEmpty(this.url)) return;

        Ext.Ajax.request({
            url     : this.url,
            success : function(response,opts) {
                this.update(response.responseText);
            },
            scope   : this
        });
    }
});